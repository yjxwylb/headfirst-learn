package com.xyj.learn.headfirst.strategypattern;

/**
 * @author: xiayuejie
 * @date: 2018/10/22 15:03
 * @description:
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can fly with my wings");
    }
}
