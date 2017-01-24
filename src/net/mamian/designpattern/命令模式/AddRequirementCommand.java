package net.mamian.designpattern.命令模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-24 23:27:32
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class AddRequirementCommand extends Command {
    @Override
    public void runCommand() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.exe();
    }
}
