package net.mamian.designpattern.适配器模式;

import java.util.Map;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-08 20:37:14
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public interface IOuterUserInfo {
    public Map<String, String> getUserBaseInfo();

    public Map<String, String> getUserWorkInfo();
}
