package net.mamian.designpattern.ԭ��ģʽ;

import java.util.Random;

/*
 * ԭ��ģʽ����ͨ��new�����¶������ͨ��clone��ʵ�ֵ�ģʽ��Ϊԭ��ģʽ
 * ���󿽱�ʱ���乹�����ǲ���ִ�е�
 * clone()ǳ������Object���ṩclone����ֻ�ǿ���������(�������int��long��String�ȳ�Ա)��������ڲ������顢���ö���ȶ�������������ָ��ԭ��������ڲ�Ԫ�ص�ַ.
 * clone()�����thing.arrayList = (ArrayList<String>)this.arrayList.clone();
 * ���ɶ�final��Աִ��clone����
 * */
public class Client {
	//�����˵������������ֵ�Ǵ����ݿ��л��
	private static int MAX_COUNT = 6;
	
	public static void main(String[] args){
		//ģ�ⷢ���ʼ�
		int i=0;
		//��ģ�嶨�����������Ǵ����ݿ��л��
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX���а�Ȩ����");
		while(i<MAX_COUNT){
			//������ÿ���ʼ���ͬ�ĵط�
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5)+" ������Ůʿ��");
			cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8)+".com");
			//Ȼ�����ʼ�
			sendMail(cloneMail);
			i++;
		}
	}
	
	//�����ʼ�
	public static void sendMail(Mail mail){
		System.out.println("���⣺"+mail.getSubject() + "\t�ռ��ˣ�"+mail.getReceiver()+"\t....���ͳɹ���");
	}
	//���ָ�����ȵ�����ַ���
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
