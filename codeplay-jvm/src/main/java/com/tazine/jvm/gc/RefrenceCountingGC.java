package com.tazine.jvm.gc;

/**
 * 引用计数GC算法
 */
public class RefrenceCountingGC {

    private Object instance = null;

    public static void main(String[] args) {
        RefrenceCountingGC a = new RefrenceCountingGC();
        RefrenceCountingGC b = new RefrenceCountingGC();

        a.instance = b;
        b.instance = a;

        a = null;
        b = null;

        System.gc();
    }
}
