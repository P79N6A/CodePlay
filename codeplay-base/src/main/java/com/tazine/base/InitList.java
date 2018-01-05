package com.tazine.base;

/**
 * 初始化顺序
 *
 * @author frank
 * @since 1.0.0
 */
public class InitList {

    static {
        System.out.println("静态语句块");
    }

    {
        i = 1;
        System.out.println("非静态语句块");
    }

    public InitList(int i) {
        this.i = i;
        System.out.println("构造函数");
    }

    public InitList() {
    }

    private int i = 3;

    public static void main(String[] args) {
        InitList initList = new InitList(2);
        System.out.println(initList.i);

        InitList list = new InitList();
        System.out.println(list.i);
        // 输出 3 而不是 1，
        // 先执行变量定义 int i = 0;
        // 接着执行 非静态语句块 i = 1;
        // 然后执行变量赋值 i = 3;
        // 接下来是构造函数赋值
    }
}
