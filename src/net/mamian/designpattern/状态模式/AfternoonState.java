package net.mamian.designpattern.״̬ģʽ;

public class AfternoonState extends State{

	@Override
	public void Coding(Work work) {
		if(work.getHour()<18){
			System.out.println("����ʱ�䣬Ŭ�����룡");
		}else{
			work.setCurrentState(new NightState());
			work.workCode();
		}
	}

}
