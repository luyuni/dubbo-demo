package top.luyuni.service.wrapper;

import top.luyuni.service.Flower;

public class FlowerWrapperB implements Flower{
    private Flower flower;

    public FlowerWrapperB(Flower flower) {
        this.flower = flower;
    }


    @Override
    public void sayHello() {
        System.out.println("我是花花的包装类B ~~~");
        flower.sayHello();
        System.out.println("我是花花的包装类B !!!");
    }
}
