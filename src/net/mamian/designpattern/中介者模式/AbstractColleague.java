package net.mamian.designpattern.�н���ģʽ;

/*
 * ����һ��protected���εĳ����н��߶���mediator�������еĶ���ɹ�����н��߲����ô��н��ߵķ���
 * 
 * 
 * */
public class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }

}