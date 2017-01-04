package net.mamian.designpattern.������ģʽ;

/*
 * �����ߣ�
 * */
public class Visitor implements VisitorInterface{

	public Visitor() {
		
	}

	@Override
	public void visit(CommonEmployee commonEmployee) {
		String commonEmployeeInfo = getCommonEmployee(commonEmployee);
		System.out.println(commonEmployeeInfo);
	}

	@Override
	public void visit(Manager manager) {
		String managerInfo = getManagerInfo(manager);
		System.out.println(managerInfo);
	}
	
	
	
	//��װ��������Ϣ
	private String getBasicInfo(Employee employee){
		String info = "������" + employee.getName() + "\t";
		info = info + "�Ա�" + (employee.getSex() == Employee.FEMALE?"Ů":"��") + "\t";
		info = info + "нˮ��" + employee.getSalary() + "\t";
		return info;
	}
	private String getCommonEmployee(CommonEmployee commonEmployee){
		String basicInfo = this.getBasicInfo(commonEmployee);
		String otherInfo = "������"+commonEmployee.getJob()+"\t";
		return basicInfo + otherInfo;
	}
	
	private String getManagerInfo(Manager manager){
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "ҵ����"+manager.getPerformance() + "\t";
		return basicInfo + otherInfo;
	}
}
