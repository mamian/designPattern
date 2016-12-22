package net.mamian.designpattern.状态模式;

public class NightState extends State{

	@Override
	public void Coding(Work work) {
		if(work.getHour()<21){
			System.out.println("晚上时间，努力编码！");
		}else{
			System.out.println("该下班了！");
		}
	}

}
