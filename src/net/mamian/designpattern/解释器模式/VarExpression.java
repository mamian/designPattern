package net.mamian.designpattern.解释器模式;

import java.util.HashMap;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-05 20:33:59
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> map) {
        return map.get(key);
    }
}
