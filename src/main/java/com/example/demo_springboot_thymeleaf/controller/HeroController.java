package com.example.demo_springboot_thymeleaf.controller;

import com.example.demo_springboot_thymeleaf.pojo.Hero;
import com.example.demo_springboot_thymeleaf.service.HeroService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by CZWGOGO on 2019/10/5 1:10
 */
@RestController
public class HeroController {
    @Autowired
    HeroService heroService;
    /*restful 部分*/
    @GetMapping("/heroes")
    public PageInfo<Hero> list(@RequestParam(value = "start", defaultValue = "1") int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        PageHelper.startPage(start,size,"id desc");
        List<Hero> hs=heroService.list();
        System.out.println(hs.size());

        PageInfo<Hero> page = new PageInfo<>(hs,5); //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样

        return page;
    }

    @GetMapping("/heroes/{id}")
    public Hero get(@PathVariable("id") int id) throws Exception {
        System.out.println(id);
        Hero h=heroService.get(id);
        System.out.println(h);
        return h;
    }

    @PostMapping("/heroes")
    public String add(@RequestBody Hero h) throws Exception {
        heroService.add(h);
        return "success";
    }
    @DeleteMapping("/heroes/{id}")
    public String delete(Hero h) throws Exception {
        heroService.delete(h.getId());
        return "success";
    }
    @PutMapping("/heroes/{id}")
    public String update(@RequestBody Hero h) throws Exception {
        heroService.update(h);
        return "success";
    }

    /*页面跳转 部分*/
    @RequestMapping(value="/listHero",method= RequestMethod.GET)
    public ModelAndView listHero(){
        ModelAndView mv=new ModelAndView("listHero");
        return mv;
    }
    @RequestMapping(value="/editHero",method = RequestMethod.GET)
        public ModelAndView editHero(){
            ModelAndView mv=new ModelAndView("editHero");
            return mv;

    }

}
