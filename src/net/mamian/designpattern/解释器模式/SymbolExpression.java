package net.mamian.designpattern.������ģʽ;

public abstract class SymbolExpression extends Expression{
	protected Expression left;
	protected Expression right;
	
	public SymbolExpression(Expression left,Expression right){
		this.left = left;
		this.right = right;
	}
}
