package net.mamian.designpattern.�۲���ģʽ;

import java.util.Observer;
import java.util.Observable;

/*
 * �۲��߶���ʵ��Observer�ӿڵ�update(Observable observable, Object arg1)��������һ������Ϊ�����۲�Ķ��󣬵ڶ�������Ϊ���۲��߶��󴫵ݸ��Լ�����Ϣ
 * */
public class Wangsi implements Observer{
	public void update(Observable observable,Object arg1){
		System.out.println("Wangsi�۲�����˹�۲쵽���۲��ߺ����ӿ�ʼ���л�ˣ�"+arg1.toString());
		System.out.println("Wangsi�۲�����˹�۲���ϣ�");
		System.out.println("Wangsi=====================================================");
	}
}
