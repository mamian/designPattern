package net.mamian.designpattern.������ģʽ;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/*
 * ������ģʽ��һ���������ν����������ȥ����������A�޷������򽻸���һ�¶���B������B�޷������򽻸���һ������C����
 * �ڸ����ӵĸ����ж��壺����������޷�����ĳ�������򽻸���һ��������
 * ����������Ķ����˳����client��ʵʱ����
 * */
public class Client {
	public static void main(String[] args) {
		//�����ѡ����Ů��
		Random rand = new Random();
		List<WomenInterface> arrayList = new ArrayList<WomenInterface>();
		for(int i=0;i<5;i++){
			arrayList.add(new Women(rand.nextInt(4),"��Ҫ��ȥ���"));
		}
		//����������ʾ����
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		
		//������ʾ˳��
		father.setNext(husband);
		husband.setNext(son);
		for(WomenInterface women:arrayList){
			father.HandleMessage(women);
		}
	}
}
