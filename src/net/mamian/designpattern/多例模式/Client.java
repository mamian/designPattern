package net.mamian.designpattern.����ģʽ;

/*
 * ����static���������ʵ������maxInstanceNum����ǰʵ�����nowInstanceNum��ʵ���б�instanceList
 * һ��static����飺�˴����������maxInstanceNum��ʵ������������ӵ�ʵ���б�instanceList��
 * ���췽��Ϊprivate
 * һ��static����getInstance����ȡ0-maxInstanceNum���һ���������random.nextInt(maxInstanceNum)������ʵ���б�instanceList�л�ȡ����Ϊ���������ʵ��
 * */
public class Client {
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			Multiton.getInstance();
			System.out.print("��"+(i+1)+"���󳼲ΰݵ��ǣ�");
			Multiton.emperorInfo();
		}
	}
}
