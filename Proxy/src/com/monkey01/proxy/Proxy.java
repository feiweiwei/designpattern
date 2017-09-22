package com.monkey01.proxy;

/**
 * Created by feiweiwei on 17/8/9.
 * 代理类的核心思想史隔离被代理类，不能直接访问被代理类，必须通过代理类去访问
 */
public class Proxy implements ISource {
    ISource source = new Source();

    @Override
    public void method1() {
        this.before();
        source.method1();
        this.after();
    }

    private void before(){
        System.out.println("proxy: before method");
    }

    private void after(){
        System.out.println("proxy: after method");
    }
}
