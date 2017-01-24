package net.mamian.designpattern.命令模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-24 23:32:19
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public abstract class Group {
    protected abstract void find();

    protected abstract void add();

    protected abstract void delete();

    protected abstract void change();

    protected abstract void exe();
}
