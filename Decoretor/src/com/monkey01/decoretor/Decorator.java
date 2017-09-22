package com.monkey01.decoretor;

/**
 * Created by feiweiwei on 17/8/9.
 * 装饰类的核心就是保证和原接口一致，只是对原接口功能做了增强，这是和适配器模式的最大区别
 */
public class Decorator implements ISource{
    private Source source = new Source();
    @Override
    public String method1(String args0) {
        return "decorator " + source.method1(args0);
    }
}
