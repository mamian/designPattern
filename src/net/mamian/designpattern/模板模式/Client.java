package net.mamian.designpattern.模板模式;
/*
 * 模板模式：抽象父类中定义好各子类要执行的某一个final方法，此方法中调用了抽象父类中的其他方法，并且方法是有序的
 * */
public class Client {
	public static void main(String[] args){
		Model modelA = new ModelA();
		modelA.run();
		
		Model modelB = new ModelB();
		modelB.run();
	}
}
