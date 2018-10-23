package com.xyj.learn.headfirst.strategypattern;

/**
 * @author: xiayuejie
 * @date: 2018/10/22 14:31
 * @description:
 */
public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("=======外观是绿头鸭=======");
    }

    public MallardDuck(){
        quackBehavior=new NormalQuack();
        flyBehavior=new FlyWithWings();
    }
}
