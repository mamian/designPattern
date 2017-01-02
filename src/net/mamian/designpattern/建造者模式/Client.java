package net.mamian.designpattern.������ģʽ;

import java.util.ArrayList;

/*
 * ��ģ��ģʽ���ƣ�������ģʽ�����˽�����
 * ������ʵ������������һ������Ҫ����Ķ�����һ������Ҫ����Ķ����е�ͨ�÷����е�����������˳��*/
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
