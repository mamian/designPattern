package net.mamian.designpattern.�н���ģʽ;

public class Store extends AbstractColleague{
	public Store(AbstractMediator mediator){
		super(mediator);
	}
	
	public void startStore(int num){
		super.mediator.execute("�洢", num);
		System.out.println("Store����ִ��startStore����");
	}
}
