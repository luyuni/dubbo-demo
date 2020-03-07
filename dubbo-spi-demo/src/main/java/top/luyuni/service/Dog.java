package top.luyuni.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Dog {

    @Adaptive(value = "xdog") // 默认value是dog
    void sayHello(URL url);

}
