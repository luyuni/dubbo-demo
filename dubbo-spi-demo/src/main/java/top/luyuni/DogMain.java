package top.luyuni;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import top.luyuni.service.Dog;

public class DogMain {
    public static void main(String[] args) {
        ExtensionLoader<Dog> extensionLoader = ExtensionLoader.getExtensionLoader(Dog.class);
        URL url = URL.valueOf("http://localhost?xdog=yellow");
        /**
         * @Adaptive
         *      配置在方法是，解析url参数，拿到key，动态生成 Dog$Adaptive。
         * {@link top.luyuni.service.Dog$Adaptive}
         */
        Dog adaptiveExtension = extensionLoader.getAdaptiveExtension();
        adaptiveExtension.sayHello(url);
    }
}
