package net.mamian.designpattern.观察者模式;

import java.util.Observable;
import java.util.Observer;

/*
 * 观察者对象，实现Observer接口的update(Observable observable, Object arg1)方法，第一个参数为其所观察的对象，第二个参数为被观察者对象传递给自己的信息
 * */
public class Lisi implements Observer{
	@Override
	public void update(Observable observable, Object arg1) {
		System.out.println("Lisi观察者李斯观察到被观察者韩非子开始进行活动了："+arg1.toString());
		System.out.println("Lisi观察者李斯观察完毕！");
		System.out.println("Lisi=====================================================");
	}
}
