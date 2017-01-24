package net.mamian.designpattern.命令模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-24 23:46:24
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class RequirementGroup extends Group {
    @Override
    protected void find() {
        System.out.println("需求组：找到需求组！");
    }

    @Override
    protected void add() {
        System.out.println("需求组：增加一条需求！");
    }

    @Override
    protected void delete() {
        System.out.println("需求组：减少一条需求！");
    }

    @Override
    protected void change() {
        System.out.println("需求组：修改一条需求！");
    }

    @Override
    protected void exe() {
        System.out.println("需求组：执行对需求的更改！");
    }
}