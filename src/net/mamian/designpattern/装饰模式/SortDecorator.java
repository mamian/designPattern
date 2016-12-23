package net.mamian.designpattern.װ��ģʽ;

public class SortDecorator extends Decorator{

	public SortDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	
	private void sugarSort(){
		System.out.println("����������38��...");
	}
	
	@Override
	public void getReportInfo() {
		System.out.println("װ����2��ʼ22222222222222222222222222222222222");
		sugarSort();//��ΪҪװ�εķ���2
		super.getReportInfo();
		System.out.println("װ����2����22222222222222222222222222222222222");
	}
}
