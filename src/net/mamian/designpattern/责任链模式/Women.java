package net.mamian.designpattern.责任链模式;

public class Women implements WomenInterface{
	private int type=0;//1未出嫁        2出嫁        3夫死
	private String request = "";
	
	public Women(int type,String request){
		this.type = type;
		//为了显示好看点，我在这里做了点处理
		switch(type){
			case 1:
				this.request = "女儿的请求是：" + request;
				break;
			case 2:
				this.request = "妻子的请求是：" + request;
				break;
			case 3:
				this.request = "母亲的请求是：" + request;
		}
	}
	
	@Override
	public int getType() {
		return type;
	}

	@Override
	public String getRequest() {
		return request;
	}
}
