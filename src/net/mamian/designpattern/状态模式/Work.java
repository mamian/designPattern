package net.mamian.designpattern.状态模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-01 18:12:23
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Work {
    private int hour;
    private State currentState;

    public Work() {
        this.currentState = new MorningState();
    }

    public void workCode() {
        this.currentState.Coding(this);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
