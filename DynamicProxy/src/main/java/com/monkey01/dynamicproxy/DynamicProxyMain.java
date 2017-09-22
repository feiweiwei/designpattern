package com.monkey01.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: feiweiwei
 * @Description:
 * @Created Date: 10:00 17/9/22.
 * @Modify by:
 */
public class DynamicProxyMain {

	public static void main(String[] args){
		Subject realSubject = new RealSubject();
		Subject realSubject2 = new RealSubject2();

		InvocationHandler handler = new DynamicProxyAOP(realSubject);
		InvocationHandler handler2 = new DynamicProxyAOP(realSubject2);

		Subject subject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(),
				handler);

		Subject subject2 = (Subject) Proxy.newProxyInstance(realSubject2.getClass().getClassLoader(),
				realSubject2.getClass().getInterfaces(),
				handler2);

		subject.doSomething("tester ");
		subject2.doSomething("tester ");
	}
}
