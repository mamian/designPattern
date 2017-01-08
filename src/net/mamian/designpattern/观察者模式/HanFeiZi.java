package net.mamian.designpattern.观察者模式;

import java.util.Observable;

/*
 * 这是被观察者，继承Observable类
 * 
 * 通知那些正在观察自己的观察者，自己已经发生改变了，并传递一些信息给那些观察者
 * super.setChanged();
 * super.notifyObservers("HaiFeiZi被观察者韩非子在进行活动1时，传递给各位观察者的信息！");
 * 
 * */
public class HanFeiZi extends Observable{
	
	public void activeOne(){
		System.out.println("HaiFeiZi被观察者韩非子正在进行活动1.");
		
		//通知所有的观察者
		super.setChanged();
		super.notifyObservers("HaiFeiZi被观察者韩非子在进行活动1时，传递给各位观察者的信息！");
	}
	
	public void activeTwo(){
		System.out.println("HaiFeiZi被观察者韩非子正在进行活动2.");
		
		//通知所有的观察者
		super.setChanged();
		super.notifyObservers("HaiFeiZi被观察者韩非子在进行活动2时，传递给各位观察者的信息！");
	}
}
