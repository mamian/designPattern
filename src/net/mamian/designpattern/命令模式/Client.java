package net.mamian.designpattern.命令模式;

/**
 * 抽象分组类及三个实现类（需求组、页面组、代码组）
 * 抽象命令类及多个实现类（增加需求命令、减少页面命令等）
 * <p/>
 * 命令接收者类，此类中有一个私有的命令成员和一个触发方法（此方法会执行私有命令成员的某个方法）
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-24 23:52:47
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Command addRequirementCommand = new AddRequirementCommand();
        invoker.setCommand(addRequirementCommand);
        invoker.action();

        Command deletePageCommand = new DeletePageCommand();
        invoker.setCommand(deletePageCommand);
        invoker.action();
    }
}
