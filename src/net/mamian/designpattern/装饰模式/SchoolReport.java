package net.mamian.designpattern.装饰模式;
/*
 * 成绩单父类，包含获取成绩信息、家长签字功能
 * 
 * */
public abstract class SchoolReport {
	public abstract void getReportInfo();
	public abstract void parentSign(String parentName);
}
