package net.mamian.designpattern.�۲���ģʽ;

import java.util.Observable;

/*
 * ���Ǳ��۲��ߣ��̳�Observable��
 * 
 * ֪ͨ��Щ���ڹ۲��Լ��Ĺ۲��ߣ��Լ��Ѿ������ı��ˣ�������һЩ��Ϣ����Щ�۲���
 * super.setChanged();
 * super.notifyObservers("HaiFeiZi���۲��ߺ������ڽ��л1ʱ�����ݸ���λ�۲��ߵ���Ϣ��");
 * 
 * */
public class HanFeiZi extends Observable{
	
	public void activeOne(){
		System.out.println("HaiFeiZi���۲��ߺ��������ڽ��л1.");
		
		//֪ͨ���еĹ۲���
		super.setChanged();
		super.notifyObservers("HaiFeiZi���۲��ߺ������ڽ��л1ʱ�����ݸ���λ�۲��ߵ���Ϣ��");
	}
	
	public void activeTwo(){
		System.out.println("HaiFeiZi���۲��ߺ��������ڽ��л2.");
		
		//֪ͨ���еĹ۲���
		super.setChanged();
		super.notifyObservers("HaiFeiZi���۲��ߺ������ڽ��л2ʱ�����ݸ���λ�۲��ߵ���Ϣ��");
	}
}
