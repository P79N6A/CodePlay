package com.tazine.design.factory.cases.product;

/**
 * Created by lina on 2018/1/28.
 *
 * @author frank
 * @since 1.0.0
 */
public class ThinkPad implements NoteBook {
    @Override
    public void surf() {
        System.out.println("使用 ThinkPad 上网");
    }
}
