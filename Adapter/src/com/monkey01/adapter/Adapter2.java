package com.monkey01.adapter;

/**
 * Created by feiweiwei on 17/8/9.
 * 通过引用对象实现获取Adaptee类旧接口的功能
 */
public class Adapter2 {
    private Adaptee adaptee = new Adaptee();

    public void newMethod1(){
        adaptee.method1();
    }
    public String newMethod2(String args0, String args1){
        adaptee.method2(args0, args1);
        return args0 + args1;
    }
}
