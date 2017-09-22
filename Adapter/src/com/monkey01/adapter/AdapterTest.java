package com.monkey01.adapter;

/**
 * Created by feiweiwei on 17/8/9.
 */
public class AdapterTest {
    public static void main(String args[]) {
        Adapter adapter = new Adapter();
        adapter.newMethod1();
        adapter.newMethod2("hello", "world");

        Adapter2 adapter2 = new Adapter2();
        adapter2.newMethod1();
        adapter2.newMethod2("hello", "world2");
    }
}
