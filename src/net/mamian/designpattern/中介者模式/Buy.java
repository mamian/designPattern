package net.mamian.designpattern.�н���ģʽ;

public class Buy extends AbstractColleague {
    public Buy(AbstractMediator mediator) {
        super(mediator);
    }

    public void startBuy(int num) {
        super.mediator.execute("����", num);
        System.out.println("Buy����ִ��startBuy����");
    }

    public void NotBuy() {
        System.out.println("Buy����ִ��NotBuy����");
    }
}