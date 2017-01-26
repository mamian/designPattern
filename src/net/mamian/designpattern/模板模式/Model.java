package net.mamian.designpattern.模板模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-31 21:22:39
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public abstract class Model {
    protected abstract void start();

    protected abstract void alarm();

    protected abstract void stop();

    public final void run() {
        this.start();
        this.alarm();
        this.stop();
    }
}
