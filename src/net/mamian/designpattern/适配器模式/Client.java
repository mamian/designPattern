package net.mamian.designpattern.������ģʽ;
/*
 * Ŀ�Ľӿڣ�Ŀ����------��ת���ӿڣ���ת����------������
 * 
 * �������̳д�ת���࣬ʵ��Ŀ�Ľӿڣ����ݴ�ת����ķ���ʵ��ԭĿ�Ľӿڵķ�����
 * 
 * ����Ҫ�ý���ת������תΪĿ�Ķ���ʱ����Ŀ�Ķ����д���һ�����������󼴿�*/
public class Client {//-------------------------------------------------------������Ҫ�̳д�ת���࣬ʵ��Ŀ�Ľӿ�
	public static void main(String[] args){
		IUserInfo convertedUser = new Adapter();
		convertedUser.getUserName();
		convertedUser.getUserAddress();
		convertedUser.getUserTel();
		convertedUser.getPosition();
	}
}
