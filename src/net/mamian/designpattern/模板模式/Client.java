package net.mamian.designpattern.ģ��ģʽ;
/*
 * ģ��ģʽ���������ж���ø�����Ҫִ�е�ĳһ��final�������˷����е����˳������е��������������ҷ����������
 * */
public class Client {
	public static void main(String[] args){
		Model modelA = new ModelA();
		modelA.run();
		
		Model modelB = new ModelB();
		modelB.run();
	}
}
