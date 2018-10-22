package com.xyj.learn.headfirst.strategypattern;

/**
 * @author: xiayuejie
 * @date: 2018/10/22 15:06
 * @description:
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
