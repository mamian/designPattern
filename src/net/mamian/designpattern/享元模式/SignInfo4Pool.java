package net.mamian.designpattern.享元模式;

/**
 * 给SignInfo对象增加key属性：
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-22 23:19:13
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class SignInfo4Pool extends SignInfo {
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}