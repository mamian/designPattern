package net.mamian.designpattern.命令模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-24 23:35:23
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class PageGroup extends Group {
    @Override
    protected void find() {
        System.out.println("页面组：找到页面组！");
    }

    @Override
    protected void add() {
        System.out.println("页面组：增加一个页面！");
    }

    @Override
    protected void delete() {
        System.out.println("页面组：减少一个页面！");
    }

    @Override
    protected void change() {
        System.out.println("页面组：修改一个页面！");
    }

    @Override
    protected void exe() {
        System.out.println("页面组：执行对页面的更改！");
    }
}