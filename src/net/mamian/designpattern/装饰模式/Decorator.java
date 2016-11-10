package net.mamian.designpattern.装饰模式;

public abstract class Decorator extends SchoolReport{
	private SchoolReport schoolReport;
	
	public Decorator(SchoolReport schoolReport) {
		this.schoolReport = schoolReport;
	}
	
	@Override
	public void getReportInfo() {
		schoolReport.getReportInfo();
	}
	
	@Override
	public void parentSign(String parentName) {
		schoolReport.parentSign(parentName);
	}
}
