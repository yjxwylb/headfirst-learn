package com.xyj.learn.headfirst.strategypattern;

/**
 * @author: xiayuejie
 * @date: 2018/10/22 15:10
 * @description:
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
