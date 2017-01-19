package net.mamian.designpattern.中介者模式;

/*
 * 包含一个protected修饰的抽象中介者对象mediator，其所有的对象可共享此中介者并调用此中介者的方法
 * 
 * 
 * */
public class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }

}