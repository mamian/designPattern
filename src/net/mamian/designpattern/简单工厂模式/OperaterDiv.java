package net.mamian.designpattern.简单工厂模式;

public class OperaterDiv extends Operater{
	public int getResult(int divA,int divB){
		System.out.println("除法");
		return divA/divB;
	}
}
