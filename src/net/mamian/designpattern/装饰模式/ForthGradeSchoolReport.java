package net.mamian.designpattern.装饰模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-03 20:07:54
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class ForthGradeSchoolReport extends SchoolReport {
    @Override
    public void getReportInfo() {
        System.out.println("尊敬的XXX家长，您儿子的成绩为:");
        System.out.println("语文 62 数学65 体育 98 自然 63");
    }

    @Override
    public void parentSign(String parentName) {
        System.out.println("家长签字为：" + parentName);
    }
}
