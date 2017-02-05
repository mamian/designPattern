package net.mamian.designpattern.解释器模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-05 20:32:07
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
