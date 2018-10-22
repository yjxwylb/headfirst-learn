package com.xyj.learn.headfirst.strategypattern;

/**
 * @author: xiayuejie
 * @date: 2018/10/22 15:09
 * @description:
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
