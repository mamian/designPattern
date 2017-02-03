package net.mamian.designpattern.装饰模式;

/**
 * 成绩单父类，包含获取成绩信息、家长签字功能
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-03 20:04:09
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public abstract class SchoolReport {
    public abstract void getReportInfo();

    public abstract void parentSign(String parentName);
}
