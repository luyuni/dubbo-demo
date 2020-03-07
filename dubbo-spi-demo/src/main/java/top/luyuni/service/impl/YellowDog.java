package top.luyuni.service.impl;

import org.apache.dubbo.common.URL;
import top.luyuni.service.Dog;

public class YellowDog implements Dog {
    @Override
    public void sayHello(URL url) {
        System.out.println("我是黄色的狗狗");
    }
}
