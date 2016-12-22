package net.mamian.designpattern.状态模式;

public class MorningState extends State{

	@Override
	public void Coding(Work work) {
		if(work.getHour()<12){
			System.out.println("早上时间，努力编码！");
		}else{
			work.setCurrentState(new AfternoonState());
			work.workCode();
		}
	}
	
}
