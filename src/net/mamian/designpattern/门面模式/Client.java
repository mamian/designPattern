package net.mamian.designpattern.门面模式;

/**
 * 门面模式：一个子系统比较复杂的话，比如算法或者业务比较复杂，就可以封装出一个或多个门面出来
 * 在一个较大项目中的时候，为了避免人员带来的风险，也可以使用这个模式，技术水平比较差的成员，尽量安排独立的模块（Sub System），然后把他写的程序封装到一个门面里，尽量让其他项目成员不用看到这些烂人的代码
 * <p/>
 * 将复杂的业务封装在一个方法中对外提供服务，外部人员不用看到内部太复杂的具体实现
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-09 20:42:02
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Client {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        postOffice.mySend("myTitle", "myContent", "myAddress");
    }
}
