package net.mamian.designpattern.建造者模式;

public class ModelB extends Model{

	@Override
	protected void start() {
		System.out.println("车辆B启动");
	}

	@Override
	protected void alarm() {
		System.out.println("车辆B鸣笛");
	}

	@Override
	protected void stop() {
		System.out.println("车辆B刹车");
	}

}
