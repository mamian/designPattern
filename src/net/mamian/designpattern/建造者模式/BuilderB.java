package net.mamian.designpattern.建造者模式;

import java.util.ArrayList;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-28 20:23:14
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class BuilderB extends Builder {
    private ModelB modelB = new ModelB();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        modelB.setSequence(sequence);
    }

    @Override
    public Model getModel() {
        return modelB;
    }

}
