package net.mamian.designpattern.中介者模式;

public class Sell extends AbstractColleague{
	public Sell(AbstractMediator mediator){
		super(mediator);
	}
	
	public void startSell(int num){
		super.mediator.execute("销售", num);
		System.out.println("Sell对象执行startSell方法");
	}
}
