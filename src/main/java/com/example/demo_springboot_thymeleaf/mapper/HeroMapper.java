package com.example.demo_springboot_thymeleaf.mapper;

import com.example.demo_springboot_thymeleaf.pojo.Hero;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by CZWGOGO on 2019/10/4 20:20
 */
@Mapper
public interface HeroMapper {
    int add(Hero hero);

    void delete(int id);

    Hero get(int id);

    int update(Hero hero);


    List<Hero> list();
}
