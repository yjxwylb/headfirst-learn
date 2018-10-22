package com.xyj.learn.headfirst.strategypattern;

/**
 * @author: xiayuejie
 * @date: 2018/10/22 14:33
 * @description:  橡皮鸭，会吱吱叫，不会飞
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        quackBehavior=new Squeak();
        flyBehavior=new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("=========外观是橡皮鸭========");
    }
}
