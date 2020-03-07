package top.luyuni.service;


import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Car {
    void sayHello();
}
