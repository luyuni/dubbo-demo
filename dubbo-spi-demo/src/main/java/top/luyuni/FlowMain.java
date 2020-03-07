package top.luyuni;

import org.apache.dubbo.common.extension.ExtensionLoader;
import top.luyuni.service.Flower;

public class FlowMain {
    public static void main(String[] args) {
        ExtensionLoader<Flower> extensionLoader = ExtensionLoader.getExtensionLoader(Flower.class);
        Flower flower = extensionLoader.getExtension("big");
        flower.sayHello();
    }
}
