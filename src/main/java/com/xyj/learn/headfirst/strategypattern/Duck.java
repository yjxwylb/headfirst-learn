package com.xyj.learn.headfirst.strategypattern;

/**
 * @author: xiayuejie
 * @date: 2018/10/22 14:29
 * @description:
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 鸭子的外观
     */
    public abstract void display() ;

    /**
     * 鸭子的叫声
     */
    public  void performQuack(){
        quackBehavior.quack();
    }
    /**
     * 鸭子飞行
     */
    public void performFly(){
        flyBehavior.fly();
    }

    /**
     * 游泳
     */
    public void swim(){
        System.out.println("Any kinds of  duck can swim happily");
    }

}
