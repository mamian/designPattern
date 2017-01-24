package net.mamian.designpattern.命令模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-24 23:30:25
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class DeletePageCommand extends Command {
    @Override
    public void runCommand() {
        super.pageGroup.find();
        super.pageGroup.delete();
        super.pageGroup.exe();
    }
}
