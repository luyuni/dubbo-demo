package top.luyuni.service.impl;

import top.luyuni.service.Flower;

public class SmallFlower implements Flower {
    @Override
    public void sayHello() {
        System.out.println("我是小花花");
    }
}
