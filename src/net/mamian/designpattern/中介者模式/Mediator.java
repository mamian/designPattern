package net.mamian.designpattern.中介者模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2016-10-2 21:26:45
 * @copyright ©2016 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String message, Object obj1) {//参数为判断执行哪个对象方法的条件和参数
        if (message.equals("购买")) {
            buyComputer((Integer) obj1);
            System.out.println("具体中介者对象mediator的execute方法" + message);
        } else if (message.equals("销售")) {
            sellComputer((Integer) obj1);
            System.out.println("具体中介者对象mediator的execute方法" + message);
        } else if (message.equals("存储")) {
            storeComputer((Integer) obj1);
            System.out.println("具体中介者对象mediator的execute方法" + message);
        }
    }

    private void buyComputer(int num) {
        System.out.println("具体中介者对象执行buyComputer方法，购买" + num + "台电脑");
    }

    private void sellComputer(int num) {
        System.out.println("具体中介者对象执行sellComputer方法，销售" + num + "台电脑");
    }

    private void storeComputer(int num) {
        System.out.println("具体中介者对象执行storeComputer方法，储存" + num + "台电脑");
    }
}