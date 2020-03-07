package top.luyuni.service.impl;

import org.apache.dubbo.common.extension.Adaptive;
import top.luyuni.service.Shape;

@Adaptive
public class RectangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
