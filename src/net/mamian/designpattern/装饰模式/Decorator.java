package net.mamian.designpattern.装饰模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-03 20:06:14
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public abstract class Decorator extends SchoolReport {
    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    public void getReportInfo() {
        schoolReport.getReportInfo();
    }

    @Override
    public void parentSign(String parentName) {
        schoolReport.parentSign(parentName);
    }
}
