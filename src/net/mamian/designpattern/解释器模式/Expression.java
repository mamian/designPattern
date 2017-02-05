package net.mamian.designpattern.解释器模式;

import java.util.HashMap;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-05 20:27:10
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public abstract class Expression {
    //解析公式和数值,其中var中的key值是是公式中的参数，value值是具体的数字
    public abstract int interpreter(HashMap<String, Integer> map);
}