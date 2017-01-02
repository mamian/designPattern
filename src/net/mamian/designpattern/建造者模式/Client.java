package net.mamian.designpattern.建造者模式;

import java.util.ArrayList;

/*
 * 与模板模式类似，建造者模式增加了建造者
 * 建造者实现两个方法：一个返回要建造的对象，另一个设置要建造的对象中的通用方法中调用自身方法的顺序*/
public class Client {
	public static void main(String[] args){
		ArrayList<String> sequence1 = new ArrayList<String>();
		sequence1.add("alarm");
		sequence1.add("start");
		sequence1.add("stop");
		
		Builder builderA = new BuilderA();
		builderA.setSequence(sequence1);
		builderA.getModel().run();
		
		
		ArrayList<String> sequence2 = new ArrayList<String>();
		sequence2.add("start");
		sequence2.add("alarm");
		sequence2.add("stop");
		
		Builder builderB = new BuilderB();
		builderB.setSequence(sequence2);
		builderB.getModel().run();
	}
}
