package net.mamian.designpattern.������ģʽ;

public abstract class Employee {
	public final static int MALE = 0; //0����������
	public final static int FEMALE = 1; //1������Ů��
	
	private String name;//�¹���˭�����й���
	
	private int salary;//ֻҪ��Ա���Ǿ���нˮ
	
	private int sex;//�Ա����Ҫ
	
	public abstract void accept(VisitorInterface visitor);//������һ�������߹�������

	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

}
