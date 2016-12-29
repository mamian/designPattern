package net.mamian.designpattern.责任链模式;

public class Father extends Handler{
	
	public Father(){//父亲只处理女儿的请求
		super(1);
	}
	
	//父亲的答复
	@Override
	public void response(WomenInterface women) {
		System.out.println("--------女儿向父亲请示-------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是:同意\n");
	}
}
