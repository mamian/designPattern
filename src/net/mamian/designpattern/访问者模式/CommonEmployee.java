package net.mamian.designpattern.访问者模式;

public class CommonEmployee extends Employee{
	
	private String job;

	@Override
	public void accept(VisitorInterface visitor) {
		visitor.visit(this);
	}

	
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
}
