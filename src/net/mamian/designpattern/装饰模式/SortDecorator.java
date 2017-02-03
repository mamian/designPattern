package net.mamian.designpattern.装饰模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-03 20:11:34
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void sugarSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void getReportInfo() {
        System.out.println("装饰器2开始22222222222222222222222222222222222");
        sugarSort();//此为要装饰的方法2
        super.getReportInfo();
        System.out.println("装饰器2结束22222222222222222222222222222222222");
    }
}
