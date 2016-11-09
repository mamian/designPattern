package net.mamian.designpattern.简单工厂模式;

public class Factory {
	private static Operater operater;
	public Factory() {
		
	}
	public static Operater createOperater(char choose){
		switch(choose){
			case '+':
				operater = new OperaterAdd();
				break;
			case '/':
				operater = new OperaterDiv();
				break;
		}
		return operater;
	}
}
