package com.monkey01.adapter;

/**
 * Created by feiweiwei on 17/8/9.
 * 适配器类，继承旧接口服务类，提供的接口按照目标接口来实现
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void newMethod1() {
        super.method1();
    }

    @Override
    public String newMethod2(String args0, String args1) {
        super.method2(args0, args1);
        return args0 + args1;
    }
}
