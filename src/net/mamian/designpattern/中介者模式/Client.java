package net.mamian.designpattern.�н���ģʽ;

public class Client {
	public static void main(String[] args){
		AbstractMediator mediator = new Mediator();
		
		Buy buy = new Buy(mediator);
		buy.startBuy(100);
		
		Sell sell = new Sell(mediator);
		sell.startSell(200);
		
		Store store = new Store(mediator);
		store.startStore(300);
	}
}
