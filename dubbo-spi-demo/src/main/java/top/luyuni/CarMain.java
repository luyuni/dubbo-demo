package top.luyuni;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import top.luyuni.service.Car;

import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        URL url = URL.valueOf("http://localhost");
        List<Car> activateCars = extensionLoader.getActivateExtension(url, "null");
        for (Car car : activateCars) {
            car.sayHello();
        }
    }
}
