package net.mamian.designpattern.中介者模式;

public class Buy extends AbstractColleague {
    public Buy(AbstractMediator mediator) {
        super(mediator);
    }

    public void startBuy(int num) {
        super.mediator.execute("购买", num);
        System.out.println("Buy对象执行startBuy方法");
    }

    public void NotBuy() {
        System.out.println("Buy对象执行NotBuy方法");
    }
}