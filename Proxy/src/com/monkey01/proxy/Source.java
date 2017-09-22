package com.monkey01.proxy;

import com.sun.xml.internal.ws.server.sei.InvokerSource;

/**
 * Created by feiweiwei on 17/8/9.
 */
public class Source implements ISource {
    @Override
    public void method1() {
        System.out.println("hello method1");
    }
}
