package net.mamian.designpattern.观察者模式;

import java.util.Observer;
import java.util.Observable;

/*
 * 观察者对象，实现Observer接口的update(Observable observable, Object arg1)方法，第一个参数为其所观察的对象，第二个参数为被观察者对象传递给自己的信息
 * */
public class Wangsi implements Observer{
	public void update(Observable observable,Object arg1){
		System.out.println("Wangsi观察者王斯观察到被观察者韩非子开始进行活动了："+arg1.toString());
		System.out.println("Wangsi观察者王斯观察完毕！");
		System.out.println("Wangsi=====================================================");
	}
}
