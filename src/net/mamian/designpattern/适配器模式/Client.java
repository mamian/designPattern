package net.mamian.designpattern.适配器模式;

/*
 * 目的接口，目的类------待转换接口，待转换类------适配器
 * 
 * 适配器继承待转换类，实现目的接口（根据待转换类的方法实现原目的接口的方法）
 * 
 * 当需要用将待转换对象转为目的对象时，向目的对象中存入一个适配器对象即可*/
public class Client {//-------------------------------------------------------适配器要继承待转换类，实现目的接口
	public static void main(String[] args){
		IUserInfo convertedUser = new Adapter();
		convertedUser.getUserName();
		convertedUser.getUserAddress();
		convertedUser.getUserTel();
		convertedUser.getPosition();
	}
}
