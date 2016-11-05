package net.mamian.designpattern.访问者模式;

public class Manager extends Employee{
	
	private String performance;
	
	@Override
	public void accept(VisitorInterface visitor) {
		visitor.visit(this);
	}

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

}
