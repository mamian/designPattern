package net.mamian.designpattern.״̬ģʽ;

public class NightState extends State{

	@Override
	public void Coding(Work work) {
		if(work.getHour()<21){
			System.out.println("����ʱ�䣬Ŭ�����룡");
		}else{
			System.out.println("���°��ˣ�");
		}
	}

}
