package net.mamian.designpattern.状态模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-01 18:14:38
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class AfternoonState extends State {

    @Override
    public void Coding(Work work) {
        if (work.getHour() < 18) {
            System.out.println("下午时间，努力编码！");
        } else {
            work.setCurrentState(new NightState());
            work.workCode();
        }
    }

}
