package net.mamian.designpattern.简单工厂模式;

public class OperaterAdd extends Operater{
	public int getResult(int addA,int addB){
		System.out.println("加法");
		return addA+addB;
	}
}
