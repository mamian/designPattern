package net.mamian.designpattern.状态模式;

/*
 * 状态模式：当一个对象的某一个内在状态改变时，会执行自己的某个方法；
 * 而观察者模式是被观察者执行了自己的某个方法，所有的观察者可以发现被观察者的改变并针对此改变执行某些方法
 * 
 * 状态模式与责任链模式区别：责任链的责任转移由client控制，状态模式的状态转移在各状态类中控制
 * */
public class Client {
	public static void main(String[] args){
		Work work = new Work();
		work.setHour(9);
		work.workCode();
		
		work.setHour(14);
		work.workCode();
		
		work.setHour(20);
		work.workCode();
		
		work.setHour(23);
		work.workCode();
	}
}
