package net.mamian.designpattern.״̬ģʽ;

/*
 * ״̬ģʽ����һ�������ĳһ������״̬�ı�ʱ����ִ���Լ���ĳ��������
 * ���۲���ģʽ�Ǳ��۲���ִ�����Լ���ĳ�����������еĹ۲��߿��Է��ֱ��۲��ߵĸı䲢��Դ˸ı�ִ��ĳЩ����
 * 
 * ״̬ģʽ��������ģʽ����������������ת����client���ƣ�״̬ģʽ��״̬ת���ڸ�״̬���п���
 * */
public class Client {
	public static void main(String[] args){
		Work work = new Work();
		work.setHour(9);
		work.workCode();
		
		work.setHour(14);
		work.workCode();
		
		work.setHour(20);
		work.workCode();
		
		work.setHour(23);
		work.workCode();
	}
}
