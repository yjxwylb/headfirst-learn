package com.xyj.learn.headfirst.strategypattern;

/**
 * @author: xiayuejie
 * @date: 2018/10/22 15:42
 * @description:
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior=new MuteQuack();
        flyBehavior=new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("我是一只模型鸭");
    }
}
