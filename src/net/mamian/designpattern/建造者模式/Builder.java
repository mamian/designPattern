package net.mamian.designpattern.建造者模式;

import java.util.ArrayList;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-28 20:19:17
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public abstract class Builder {
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract Model getModel();
}
