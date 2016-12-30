package net.mamian.designpattern.�Ž�ģʽ;
/*
 * �ֻ�Ʒ�ƣ�Ʒ��A��Ʒ��B�����ֻ��������Ϸ��ͨѶ¼���ǾۺϹ�ϵ
 * �ֻ�Ʒ�ư����ֻ������Ʒ��<>-------���*/
public class Client {
	public static void main(String[] args){
		Brand brandA = new BrandA();
		
		brandA.setSoft(new SoftGame());
		brandA.brandRun();
		
		brandA.setSoft(new SoftAddressList());
		brandA.brandRun();
		
		
		
		Brand brandB = new BrandB();
		brandB.setSoft(new SoftGame());
		brandB.brandRun();
		brandB.setSoft(new SoftAddressList());
		brandB.brandRun();
	}
}
