package net.mamian.designpattern.װ��ģʽ;

public class ForthGradeSchoolReport extends SchoolReport{
	@Override
	public void getReportInfo() {
		System.out.println("�𾴵�XXX�ҳ��������ӵĳɼ�Ϊ:");
		System.out.println("���� 62 ��ѧ65 ���� 98 ��Ȼ 63");
	}

	@Override
	public void parentSign(String parentName) {
		System.out.println("�ҳ�ǩ��Ϊ��"+parentName);
	}
}
