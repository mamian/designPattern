package net.mamian.designpattern.命令模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-24 23:20:18
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public abstract class Command {
    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected CodeGroup codeGroup = new CodeGroup();

    public abstract void runCommand();
}
