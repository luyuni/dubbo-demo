package top.luyuni.service.impl;

import org.apache.dubbo.common.URL;
import top.luyuni.service.Dog;

public class BlueDog implements Dog {
    @Override
    public void sayHello(URL url) {
        System.out.println("我是蓝色的狗狗");
    }
}
