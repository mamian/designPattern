package net.mamian.designpattern.状态模式;

public class AfternoonState extends State{

	@Override
	public void Coding(Work work) {
		if(work.getHour()<18){
			System.out.println("下午时间，努力编码！");
		}else{
			work.setCurrentState(new NightState());
			work.workCode();
		}
	}

}
