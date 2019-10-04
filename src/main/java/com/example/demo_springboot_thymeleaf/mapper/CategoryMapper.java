package com.example.demo_springboot_thymeleaf.mapper;

import com.example.demo_springboot_thymeleaf.pojo.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by CZWGOGO on 2019/10/4 14:45
 */
@Mapper
public interface CategoryMapper {
    @Select("select * from category_")
    List<Category> findAll();

    @Insert("insert into category_ (nmae) values(#{name})")
    public int save(Category category);

    @Delete(" delete from category_ where id= #{id} ")
    public void delete(int id);

    @Select("select * from category_ where id= #{id} ")
    public Category get(int id);

    @Update("update category_ set name=#{name} where id=#{id} ")
    public int update(Category category);
}
