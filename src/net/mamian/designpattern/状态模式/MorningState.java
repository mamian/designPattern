package net.mamian.designpattern.״̬ģʽ;

public class MorningState extends State{

	@Override
	public void Coding(Work work) {
		if(work.getHour()<12){
			System.out.println("����ʱ�䣬Ŭ�����룡");
		}else{
			work.setCurrentState(new AfternoonState());
			work.workCode();
		}
	}
	
}
