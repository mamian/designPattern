package net.mamian.designpattern.������ģʽ;

public class Husband extends Handler{
	
	//�ɷ�ֻ�������ӵ�����
	public Husband(){
		super(2);
	}
	
	//�ɷ���ʾ�Ĵ�
	@Override
	public void response(WomenInterface women) {
		System.out.println("--------�������ɷ���ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("�ɷ�Ĵ��ǣ�ͬ��\n");
	}
}
