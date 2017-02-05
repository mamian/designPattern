package net.mamian.designpattern.解释器模式;

import java.util.HashMap;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-05 20:29:15
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> map) {
        return super.left.interpreter(map) - super.right.interpreter(map);
    }

}
