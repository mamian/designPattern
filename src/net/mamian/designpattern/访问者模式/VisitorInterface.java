package net.mamian.designpattern.访问者模式;

/**
 * 访问者模式：
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-06 20:27:19
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public interface VisitorInterface {
    //首先定义我可以访问普通员工
    public void visit(CommonEmployee commonEmployee);

    //其次定义，我还可以访问部门经理
    public void visit(Manager manager);
}