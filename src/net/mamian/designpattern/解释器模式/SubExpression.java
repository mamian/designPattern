package net.mamian.designpattern.½âÊÍÆ÷Ä£Ê½;

import java.util.HashMap;

public class SubExpression extends SymbolExpression{

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	@Override
	public int interpreter(HashMap<String, Integer> map) {
		return super.left.interpreter(map) - super.right.interpreter(map);
	}

}
