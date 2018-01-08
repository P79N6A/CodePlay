package com.tazine.thread.threadlocal.cases.serial;


/**
 * Created by lina on 2018/1/8.
 *
 * @author frank
 * @since 1.0.0
 */
public class GeneratorThread  implements Runnable {

    private SequenceGenerator generator;

    public GeneratorThread(SequenceGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        for (int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName() + " - " + generator.produce());
        }
    }
}