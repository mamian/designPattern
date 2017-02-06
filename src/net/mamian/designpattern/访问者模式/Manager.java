package net.mamian.designpattern.访问者模式;

/**
 * 访问者模式：
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-06 20:25:30
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Manager extends Employee {

    private String performance;

    @Override
    public void accept(VisitorInterface visitor) {
        visitor.visit(this);
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

}
