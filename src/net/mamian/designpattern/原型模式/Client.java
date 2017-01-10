package net.mamian.designpattern.原型模式;

import java.util.Random;

/*
 * 原型模式：不通过new产生新对象而是通过clone来实现的模式即为原型模式
 * 对象拷贝时，其构造器是不会执行的
 * clone()浅拷贝：Object类提供clone方法只是拷贝本对象(本对象的int、long、String等成员)，其对象内部的数组、引用对象等都不拷贝，还是指向原生对象的内部元素地址.
 * clone()深拷贝：thing.arrayList = (ArrayList<String>)this.arrayList.clone();
 * 不可对final成员执行clone方法
 * */
public class Client {
	//发送账单的数量，这个值是从数据库中获得
	private static int MAX_COUNT = 6;
	
	public static void main(String[] args){
		//模拟发送邮件
		int i=0;
		//把模板定义出来，这个是从数据库中获得
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX银行版权所有");
		while(i<MAX_COUNT){
			//以下是每封邮件不同的地方
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5)+" 先生（女士）");
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8)+".com");
			//然后发送邮件
			sendMail(cloneMail);
			i++;
		}
	}
	
	//发送邮件
	public static void sendMail(Mail mail){
		System.out.println("标题："+mail.getSubject() + "\t收件人："+mail.getReceiver()+"\t....发送成功！");
	}
	//获得指定长度的随机字符串
	public static String getRandString(int maxLength){
		String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for(int i=0;i<maxLength;i++){
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}
}
