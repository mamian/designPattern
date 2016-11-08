package net.mamian.designpattern.观察者模式;

public class Client {
	public static void main(String[] args){
		HanFeiZi haiFeiZi = new HanFeiZi();
		
		Lisi lisi = new Lisi();
		Wangsi wangsi = new Wangsi();
		haiFeiZi.addObserver(lisi);
		haiFeiZi.addObserver(wangsi);
		
		
		haiFeiZi.activeOne();
		System.out.println("*******************\n*******************\n*******************");
		haiFeiZi.activeTwo();
	}
}
