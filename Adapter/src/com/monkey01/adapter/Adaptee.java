package com.monkey01.adapter;

/**
 * Created by feiweiwei on 17/8/9.
 * 被适配的旧接口
 */
public class Adaptee {
    public void method1() {
        System.out.println("Adaptee method1");
    }

    public void method2(String args0, String args1){
        System.out.print("Adaptee method2 " + args0 + " " + args1);
    }

}

