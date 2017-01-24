package net.mamian.designpattern.命令模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-24 23:49:53
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.runCommand();
    }
}
