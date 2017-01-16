package net.mamian.designpattern.����ģʽ;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Multiton {
	private static int maxInstanceNum=10;//���ʵ������
	private static int nowInstanceNum=0;//��ǰʵ����
	private static List<Multiton> instanceList = new ArrayList<Multiton>();//ʵ���б�
	private static List<String> instanceNameList = new ArrayList<String>();//ʵ�����Ƶ��б�
	
	static{//�����еĻʵ۶���������
		for(int i=0;i<maxInstanceNum;i++){
			instanceList.add(new Multiton("��"+(i+1)+"��"));
		}
	}
	
	//private Multiton() {}
	private Multiton(String name) {
		instanceNameList.add(name);
	}
	
	public static Multiton getInstance(){
		Random random = new Random();
		nowInstanceNum = random.nextInt(maxInstanceNum); //�������һ���ʵۣ�ֻҪ�Ǹ���������ͳ�
		return (Multiton)instanceList.get(nowInstanceNum);
	}
	
	public static void emperorInfo(){
		System.out.println(instanceNameList.get(nowInstanceNum));
	}
}
