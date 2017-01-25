package net.mamian.designpattern.备忘录模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-25 10:59:54
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class MementoManager {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
