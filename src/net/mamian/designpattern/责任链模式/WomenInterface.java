package net.mamian.designpattern.责任链模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-07 20:45:15
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public interface WomenInterface {
    //获得个人状况
    public int getType();

    //获得个人请示，你要干什么？出去逛街？约会?还是看电影
    public String getRequest();
}