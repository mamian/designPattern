package net.mamian.designpattern.装饰模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-03 20:10:17
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class ScoreDecorator extends Decorator {
    public ScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void sugarScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    @Override
    public void getReportInfo() {
        System.out.println("装饰器1开始11111111111111111111111111111111111");
        sugarScore();//此为要装饰的方法1
        super.getReportInfo();
        System.out.println("装饰器1结束11111111111111111111111111111111111");
    }
}
