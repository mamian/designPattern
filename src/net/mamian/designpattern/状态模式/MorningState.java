package net.mamian.designpattern.状态模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-01 18:13:19
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class MorningState extends State {

    @Override
    public void Coding(Work work) {
        if (work.getHour() < 12) {
            System.out.println("早上时间，努力编码！");
        } else {
            work.setCurrentState(new AfternoonState());
            work.workCode();
        }
    }

}
