package net.mamian.designpattern.½âÊÍÆ÷Ä£Ê½;

import java.util.HashMap;

public class VarExpression extends Expression{
	private String key;
	
	public VarExpression(String key){
		this.key = key;
	}
	
	@Override
	public int interpreter(HashMap<String, Integer> map) {
		return map.get(key);
	}
}
