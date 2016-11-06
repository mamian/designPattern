package net.mamian.designpattern.简单工厂模式;

public class Client {
	public static void main(String[] args){
		Operater operater = Factory.createOperater('+');
		int result = operater.getResult(15,25);
		System.out.println(result);
	}
}
