package net.mamian.designpattern.�н���ģʽ;

/*
 * �����н��ߣ����������轫����Ϊ�н��������ཻ����Ϣ����ϵͳ�����
 * */
public abstract class AbstractMediator {
	
	protected Buy buy;
	protected Sell sell;
	protected Store store;

	public AbstractMediator(){
		buy = new Buy(this);
		sell = new Sell(this);
		store = new Store(this);
	}
	
	public abstract void execute(String message,Object obj1);
}
