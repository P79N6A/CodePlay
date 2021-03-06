package com.tazine.thread.concurrent.threadlocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 自定义 ThreadLocal
 *
 * @author frank
 * @date 2018/1/8
 */
public class MyThreadLocal<T> {


    private Map<Thread, T> map = Collections.synchronizedMap(new HashMap<Thread, T>());

    public void set(T value) {
        map.put(Thread.currentThread(), value);
    }

    public T get() {
        if (map.containsKey(Thread.currentThread())) {
            return map.get(Thread.currentThread());
        }
        return initialValue();
    }

    protected T initialValue() {
        return null;
    }

}
