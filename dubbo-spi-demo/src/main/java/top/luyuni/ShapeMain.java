package top.luyuni;


import org.apache.dubbo.common.extension.ExtensionLoader;
import top.luyuni.service.Shape;


public class ShapeMain {
    public static void main(String[] args) {
        ExtensionLoader<Shape> extensionLoader = ExtensionLoader.getExtensionLoader(Shape.class);

        Shape defaultExtension = extensionLoader.getDefaultExtension();
        defaultExtension.draw();

        Shape rectangle = extensionLoader.getExtension("rectangle");
        rectangle.draw();

        /**
         * @Adaptive  cachedClasses
         *      配置在Rectangle类上，
         *      配置了以后，上面的extensionLoader.getExtension("rectangle")会报错
         *      No such extension top.luyuni.service.Shape by name rectangle 具体参见ExtensionLoader#loadClass(java.util.Map, java.net.URL, java.lang.Class, java.lang.String)
         */
        Shape adaptiveExtension = extensionLoader.getAdaptiveExtension();
        adaptiveExtension.draw();


    }
}
