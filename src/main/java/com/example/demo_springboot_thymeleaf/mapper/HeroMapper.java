package com.example.demo_springboot_thymeleaf.mapper;

import com.example.demo_springboot_thymeleaf.pojo.Hero;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by CZWGOGO on 2019/10/5 10:37
 */
@Mapper
public interface HeroMapper {
    public int add(Hero hero);

    public void delete(int id);

    public Hero get(int id);

    public int update(Hero hero);

    public List<Hero> list();
}