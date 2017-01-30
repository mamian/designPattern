package net.mamian.designpattern.建造者模式;

import java.util.ArrayList;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-28 20:21:43
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class BuilderA extends Builder {
    private ModelA modelA = new ModelA();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        modelA.setSequence(sequence);
    }

    @Override
    public Model getModel() {
        return modelA;
    }

}
