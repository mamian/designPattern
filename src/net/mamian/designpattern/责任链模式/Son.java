package net.mamian.designpattern.������ģʽ;

public class Son extends Handler{

	//����ֻ����ĸ�׵�����
	public Son(){
		super(3);
	}
	//���ӵĴ�
	public void response(WomenInterface women) {
		System.out.println("--------ĸ���������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ��\n");
	}
}
