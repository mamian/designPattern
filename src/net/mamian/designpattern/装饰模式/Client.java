package net.mamian.designpattern.装饰模式;

/**
 * 为旧有的类添加新的功能:小菜穿衣
 * 旧类为A，要为A添加新功能
 * 抽象装饰类Decorator继承A的父类且包含一个A父类属性
 * 具体的装饰类Decorator1继承抽象装饰类Decorator，且覆盖旧类A的某个要修改的方法（在super.method()前或后增加要增加的功能）
 * 具体的装饰类Decorator2继承抽象装饰类Decorator，且覆盖旧类A同一个要修改的方法（在super.method()前或后增加要增加的功能）
 * <p/>
 * 客户端类中new旧类A的父类对象，并依次赋值为new A(),new Decorator1(),new Decorator2()
 * 再执行A对象的被装饰的方法即可
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-03 20:12:53
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Client {
    public static void main(String[] args) {
        SchoolReport schoolReport;

        schoolReport = new ForthGradeSchoolReport();
        schoolReport = new ScoreDecorator(schoolReport);//此为要装饰到原类中的新功能1
        schoolReport = new SortDecorator(schoolReport);//此为要装饰到原类中的新功能2

        schoolReport.getReportInfo();
        schoolReport.parentSign("家长的名字");
    }
}
