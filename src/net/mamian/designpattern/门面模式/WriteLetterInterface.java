package net.mamian.designpattern.门面模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-09 20:37:02
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public interface WriteLetterInterface {
    public void setTitle(String title);

    public void setContent(String content);

    public void setAddress(String address);

    public void sendLetter();
}
