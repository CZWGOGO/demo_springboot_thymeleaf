package com.example.demo_springboot_thymeleaf.pojo;

/**
 * Created by CZWGOGO on 2019/10/4 20:17
 */
public class Hero {
    private int id;
    private String name;
    private int hp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {

        return "Hero [id=" + id + ", name=" + name + ", hp=" + hp + "]";
    }
}