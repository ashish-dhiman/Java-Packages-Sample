package com.company;

public class SamePackNonSub {

    void m1() {
        OriginalClass originalClass = new OriginalClass();
        System.out.println(originalClass.def);
        System.out.println(originalClass.pro);
        System.out.println(originalClass.pri);
        System.out.println(originalClass.pub);
    }
}
