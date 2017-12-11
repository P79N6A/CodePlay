package com.tazine.thread.action;

/**
 * 线程的中断
 *
 * @author Frank
 * @since 1.0.0
 */
public class InterruptDemo {

    public static void main(String[] args) {
        InterruptThread thread = new InterruptThread();

        thread.start();

        thread.interrupt();
    }

}


class InterruptThread extends Thread {

    private boolean isCountinue = true;

    @Override
    public void run() {
        while (isCountinue) {
            System.out.println("InterruptThread is running......");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                System.out.println("当前线程被强制中断");
            }
        }
    }

    private void setCountinue(boolean flag) {
        isCountinue = flag;
    }
}