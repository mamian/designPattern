package net.mamian.designpattern.建造者模式;

import java.util.ArrayList;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-28 20:14:54
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public abstract class Model {
    private ArrayList<String> sequence = new ArrayList<>();

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

    final public void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String nowOrperate = sequence.get(i);
            if (nowOrperate.equals("start")) {
                this.start();
            } else if (nowOrperate.equals("alarm")) {
                this.alarm();
            } else if (nowOrperate.equals("stop")) {
                this.stop();
            }
        }
    }

    protected abstract void start();

    protected abstract void alarm();

    protected abstract void stop();
}
