package com.tazine.base.other;

/**
 * Finally
 *
 * @author frank
 * @date 2017/12/03
 */
public class ExecOrder {

    public static void main(String[] args) {

        // 即使 return 了，finally 依然会执行
        try {
            System.out.println("Hello World");
            return;
        } catch (Exception e){

        } finally {
            System.out.println("Finally ");
        }

    }
}
