package top.luyuni.service.impl;

import top.luyuni.service.Flower;

public class BigFlower implements Flower {
    @Override
    public void sayHello() {
        System.out.println("我是大花花");
    }
}
