package net.mamian.designpattern.命令模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-24 23:41:14
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class CodeGroup extends Group {
    @Override
    protected void find() {
        System.out.println("代码组：找到代码组！");
    }

    @Override
    protected void add() {
        System.out.println("代码组：增加一段代码！");
    }

    @Override
    protected void delete() {
        System.out.println("代码组：减少一段代码！");
    }

    @Override
    protected void change() {
        System.out.println("代码组：修改一段代码！");
    }

    @Override
    protected void exe() {
        System.out.println("代码组：执行对代码的更改！");
    }
}