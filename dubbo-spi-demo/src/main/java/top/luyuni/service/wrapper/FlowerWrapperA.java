package top.luyuni.service.wrapper;

import top.luyuni.service.Flower;

public class FlowerWrapperA implements Flower{
    private Flower flower;

    public FlowerWrapperA(Flower flower) {
        this.flower = flower;
    }


    @Override
    public void sayHello() {
        System.out.println("我是花花的包装类A ~~~");
        flower.sayHello();
        System.out.println("我是花花的包装类A !!!");
    }
}
