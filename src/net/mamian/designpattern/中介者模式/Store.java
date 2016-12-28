package net.mamian.designpattern.中介者模式;

public class Store extends AbstractColleague{
	public Store(AbstractMediator mediator){
		super(mediator);
	}
	
	public void startStore(int num){
		super.mediator.execute("存储", num);
		System.out.println("Store对象执行startStore方法");
	}
}
