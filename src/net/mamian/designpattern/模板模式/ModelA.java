package net.mamian.designpattern.ģ��ģʽ;

public class ModelA extends Model{

	@Override
	protected void start() {
		System.out.println("����A����");
	}

	@Override
	protected void alarm() {
		System.out.println("����A����");
	}

	@Override
	protected void stop() {
		System.out.println("����Aɲ��");
	}

}
