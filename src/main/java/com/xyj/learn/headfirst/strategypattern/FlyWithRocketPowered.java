package com.xyj.learn.headfirst.strategypattern;

/**
 * @author: xiayuejie
 * @date: 2018/10/22 15:45
 * @description:
 */
public class FlyWithRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我可以依靠火箭动力飞起来");
    }
}
