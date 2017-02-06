package net.mamian.designpattern.访问者模式;

/**
 * 访问者模式：
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-06 20:21:10
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class CommonEmployee extends Employee {

    private String job;

    @Override
    public void accept(VisitorInterface visitor) {
        visitor.visit(this);
    }


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
