package net.mamian.designpattern.�۲���ģʽ;

import java.util.Observable;
import java.util.Observer;

/*
 * �۲��߶���ʵ��Observer�ӿڵ�update(Observable observable, Object arg1)��������һ������Ϊ�����۲�Ķ��󣬵ڶ�������Ϊ���۲��߶��󴫵ݸ��Լ�����Ϣ
 * */
public class Lisi implements Observer{
	@Override
	public void update(Observable observable, Object arg1) {
		System.out.println("Lisi�۲�����˹�۲쵽���۲��ߺ����ӿ�ʼ���л�ˣ�"+arg1.toString());
		System.out.println("Lisi�۲�����˹�۲���ϣ�");
		System.out.println("Lisi=====================================================");
	}
}
