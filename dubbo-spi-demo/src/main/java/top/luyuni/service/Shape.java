package top.luyuni.service;


import org.apache.dubbo.common.extension.SPI;

@SPI(value = "circle")
public interface Shape {
    void draw();
}
