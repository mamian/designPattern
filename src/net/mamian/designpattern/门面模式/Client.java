package net.mamian.designpattern.����ģʽ;
/*
 * ����ģʽ��һ����ϵͳ�Ƚϸ��ӵĻ��������㷨����ҵ��Ƚϸ��ӣ��Ϳ��Է�װ��һ�������������
 * ��һ���ϴ���Ŀ�е�ʱ��Ϊ�˱�����Ա�����ķ��գ�Ҳ����ʹ�����ģʽ������ˮƽ�Ƚϲ�ĳ�Ա���������Ŷ�����ģ�飨Sub System����Ȼ�����д�ĳ����װ��һ�������������������Ŀ��Ա���ÿ�����Щ���˵Ĵ���
 * 
 * �����ӵ�ҵ���װ��һ�������ж����ṩ�����ⲿ��Ա���ÿ����ڲ�̫���ӵľ���ʵ��
 * */
public class Client {
	public static void main(String[] args){
		PostOffice postOffice = new PostOffice();
		postOffice.mySend("myTitle", "myContent", "myAddress");
	}
}
