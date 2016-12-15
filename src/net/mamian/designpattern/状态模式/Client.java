package net.mamian.designpattern.状态模式;

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
