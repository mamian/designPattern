package net.mamian.designpattern.������ģʽ;

public class Father extends Handler{
	
	public Father(){//����ֻ����Ů��������
		super(1);
	}
	
	//���׵Ĵ�
	@Override
	public void response(WomenInterface women) {
		System.out.println("--------Ů��������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���׵Ĵ���:ͬ��\n");
	}
}
