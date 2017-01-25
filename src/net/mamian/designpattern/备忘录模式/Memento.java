package net.mamian.designpattern.备忘录模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-25 10:57:36
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Memento {
    private String mementoName;
    private String mementoAge;

    public Memento(String mementoName, String mementoAge) {
        this.mementoName = mementoName;
        this.mementoAge = mementoAge;
    }


    public String getMementoName() {
        return mementoName;
    }

    public void setMementoName(String mementoName) {
        this.mementoName = mementoName;
    }

    public String getMementoAge() {
        return mementoAge;
    }

    public void setMementoAge(String mementoAge) {
        this.mementoAge = mementoAge;
    }
}
