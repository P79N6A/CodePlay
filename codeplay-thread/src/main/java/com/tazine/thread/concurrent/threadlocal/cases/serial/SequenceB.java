package com.tazine.thread.concurrent.threadlocal.cases.serial;

/**
 * Created by lina on 2018/1/8.
 *
 * @author frank
 * @date 2018/1/8
 */
public class SequenceB implements SequenceGenerator {

    private static ThreadLocal<Integer> numContainer = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Override
    public int produce() {
        numContainer.set(numContainer.get() + 1);
        return numContainer.get();
    }
}
