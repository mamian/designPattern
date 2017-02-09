package net.mamian.designpattern.适配器模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-08 20:38:48
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class OuterUserInfo implements IOuterUserInfo {

    @Override
    public Map<String, String> getUserBaseInfo() {
        Map<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("outUserName", "待转换的用户名称");
        baseInfoMap.put("outUserAddress", "待转换的用户地址");
        baseInfoMap.put("outUserTel", "待转换的用户电话");
        return baseInfoMap;
    }

    @Override
    public Map<String, String> getUserWorkInfo() {
        Map<String, String> workInfoMap = new HashMap<>();
        workInfoMap.put("outUserPosition", "待转换的用户职位");
        return workInfoMap;
    }

}
