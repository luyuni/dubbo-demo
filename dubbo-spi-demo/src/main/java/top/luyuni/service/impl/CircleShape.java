package top.luyuni.service.impl;

import top.luyuni.service.Shape;

public class CircleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}
