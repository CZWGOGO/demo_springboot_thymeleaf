package com.example.demo_springboot_thymeleaf.service.impl;

import com.example.demo_springboot_thymeleaf.mapper.HeroMapper;
import com.example.demo_springboot_thymeleaf.pojo.Hero;
import com.example.demo_springboot_thymeleaf.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CZWGOGO on 2019/10/5 10:34
 */
@Service
public class HeroServiceImpl implements HeroService {

    @Autowired
    HeroMapper heroMapper;

    @Override
    public int add(Hero hero) {
        return heroMapper.add(hero);
    }

    @Override
    public void delete(int id) {
        heroMapper.delete(id);
    }

    @Override
    public Hero get(int id) {
        return heroMapper.get(id);
    }

    @Override
    public int update(Hero hero) {
        return heroMapper.update(hero);
    }

    @Override
    public List<Hero> list() {
        return heroMapper.list();
    }

}