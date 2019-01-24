package com.company;

public class OriginalClass {

    public int pub = 60;
    protected int pro = 40;
    int def = 30;
    private int pri = 50;

    // 1
    void m1() {
        System.out.println(def);
        System.out.println(pro);
        System.out.println(pri);
        System.out.println(pub);
    }
}
