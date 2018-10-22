package com.xyj.learn.headfirst.strategypattern;

/**
 * @author: xiayuejie
 * @date: 2018/10/22 15:08
 * @description: 正常的鸭子叫声
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("正常的鸭子,呱呱叫");
    }
}
