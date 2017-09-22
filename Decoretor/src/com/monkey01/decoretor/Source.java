package com.monkey01.decoretor;

import java.time.chrono.IsoChronology;

/**
 * Created by feiweiwei on 17/8/9.
 */
public class Source implements ISource{
    @Override
    public String method1(String args0) {
        System.out.println("old method1 " + args0);
        return "old method1 " + args0;
    }
}
