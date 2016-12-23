package net.mamian.designpattern.装饰模式;

public class SortDecorator extends Decorator{

	public SortDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	
	private void sugarSort(){
		System.out.println("我是排名第38名...");
	}
	
	@Override
	public void getReportInfo() {
		System.out.println("装饰器2开始22222222222222222222222222222222222");
		sugarSort();//此为要装饰的方法2
		super.getReportInfo();
		System.out.println("装饰器2结束22222222222222222222222222222222222");
	}
}
