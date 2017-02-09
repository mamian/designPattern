package net.mamian.designpattern.门面模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-09 20:41:26
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class PostOffice {
    private WriteLetterInterface writeLetter = new WriteLetterImpl();

    public void mySend(String title, String content, String address) {
        writeLetter.setTitle(title);
        writeLetter.setContent(content);
        writeLetter.setAddress(address);
        writeLetter.sendLetter();
    }
}
