package net.mamian.designpattern.装饰模式;

public class ForthGradeSchoolReport extends SchoolReport{
	@Override
	public void getReportInfo() {
		System.out.println("尊敬的XXX家长，您儿子的成绩为:");
		System.out.println("语文 62 数学65 体育 98 自然 63");
	}

	@Override
	public void parentSign(String parentName) {
		System.out.println("家长签字为："+parentName);
	}
}
