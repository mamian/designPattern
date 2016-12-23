package net.mamian.designpattern.װ��ģʽ;

public class ScoreDecorator extends Decorator{
	public ScoreDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}

	private void sugarScore(){
		System.out.println("��ο������������75����ѧ��78����Ȼ��80");
	}
	@Override
	public void getReportInfo() {
		System.out.println("װ����1��ʼ11111111111111111111111111111111111");
		sugarScore();//��ΪҪװ�εķ���1
		super.getReportInfo();
		System.out.println("װ����1����11111111111111111111111111111111111");
	}
}
