package net.mamian.designpattern.享元模式;

/*
 * 享元模式：内存中存在大量实例对象，但并不是所有的实例均有效，可能GC还未到回收时机，采用享元模式可节省内存
 * 如对象池机制可以节省大量实例占用的内存空间
 * 
 * */
public class Client {
	public static void main(String[] args) {
		for(int i=0;i<4;i++){
			String location = "考点"+i;
			for(int j=0;j<10;j++){
				String key = location+"，人员"+j;
			}
		}
		
		SignInfo signInfo = SignInfoFactory.getSignInfo("考点3，人员5");
		signInfo.printSignInfo();
	}
}
