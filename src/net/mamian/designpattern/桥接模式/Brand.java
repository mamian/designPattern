package net.mamian.designpattern.桥接模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-30 19:13:35
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public abstract class Brand {
    protected Soft soft;

    //或通过带参构造方法设置soft
    public void setSoft(Soft soft) {
        this.soft = soft;
    }

    public abstract void brandRun();
}
