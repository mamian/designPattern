package net.mamian.designpattern.�н���ģʽ;

public class Sell extends AbstractColleague{
	public Sell(AbstractMediator mediator){
		super(mediator);
	}
	
	public void startSell(int num){
		super.mediator.execute("����", num);
		System.out.println("Sell����ִ��startSell����");
	}
}
