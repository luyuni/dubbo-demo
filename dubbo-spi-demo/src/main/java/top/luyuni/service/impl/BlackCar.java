package top.luyuni.service.impl;

import top.luyuni.service.Car;

//@Activate
public class BlackCar implements Car {
    @Override
    public void sayHello() {
        System.out.println("我是一辆黑色的车子");
    }
}
