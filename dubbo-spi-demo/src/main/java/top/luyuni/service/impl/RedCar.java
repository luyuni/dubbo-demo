package top.luyuni.service.impl;

import org.apache.dubbo.common.extension.Activate;
import top.luyuni.service.Car;

@Activate
public class RedCar implements Car {
    @Override
    public void sayHello() {
        System.out.println("我是一辆红色的车子");
    }
}
