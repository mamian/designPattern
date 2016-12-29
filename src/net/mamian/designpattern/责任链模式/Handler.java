package net.mamian.designpattern.责任链模式;

public abstract class Handler {
	//能处理的级别
	private int level =0;
	//责任传递，下一个人责任人是谁
	private Handler nextHanlder;
	
	//每个类都要说明一下自己能处理哪些请求
	public Handler(int level){
		this.level = level;
	}
	public final void HandleMessage(WomenInterface women){
		if(women.getType() == this.level){
			this.response(women);
		}else{
			if(this.nextHanlder != null){ //有后续环节，才把请求往后递送
				this.nextHanlder.HandleMessage(women);
			}else{ //已经没有后续处理人了，不用处理了
				System.out.println("-----------没地方请示了，不做处理！---------\n");
			}
		}
	}
	
	public void setNext(Handler _handler){
		this.nextHanlder = _handler;
	}
	
	//有请示那当然要回应
	public abstract void response(WomenInterface women);
}
