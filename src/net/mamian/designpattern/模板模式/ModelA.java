package net.mamian.designpattern.模板模式;

public class ModelA extends Model{

	@Override
	protected void start() {
		System.out.println("车辆A启动");
	}

	@Override
	protected void alarm() {
		System.out.println("车辆A鸣笛");
	}

	@Override
	protected void stop() {
		System.out.println("车辆A刹车");
	}

}
