package top.luyuni.service;


import org.apache.dubbo.common.extension.ExtensionLoader;

public class Dog$Adaptive implements top.luyuni.service.Dog {
    public void sayHello(org.apache.dubbo.common.URL arg0) {
        if (arg0 == null) throw new IllegalArgumentException("url == null");
        org.apache.dubbo.common.URL url = arg0;
        String extName = url.getParameter("xdog");
        if (extName == null)
            throw new IllegalStateException("Fail to get extension(top.luyuni.service.Dog) name from url(" + url.toString() + ") use keys([dog])");
        top.luyuni.service.Dog extension = (top.luyuni.service.Dog) ExtensionLoader.getExtensionLoader(top.luyuni.service.Dog.class).getExtension(extName);
        extension.sayHello(arg0);
    }
}