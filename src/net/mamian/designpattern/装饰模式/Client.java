package net.mamian.designpattern.װ��ģʽ;
/*
 * Ϊ���е�������µĹ���:С�˴���
 * ����ΪA��ҪΪA����¹���
 * ����װ����Decorator�̳�A�ĸ����Ұ���һ��A��������
 * �����װ����Decorator1�̳г���װ����Decorator���Ҹ��Ǿ���A��ĳ��Ҫ�޸ĵķ�������super.method()ǰ�������Ҫ���ӵĹ��ܣ�
 * �����װ����Decorator2�̳г���װ����Decorator���Ҹ��Ǿ���Aͬһ��Ҫ�޸ĵķ�������super.method()ǰ�������Ҫ���ӵĹ��ܣ�
 * 
 * �ͻ�������new����A�ĸ�����󣬲����θ�ֵΪnew A(),new Decorator1(),new Decorator2()
 * ��ִ��A����ı�װ�εķ�������
 * */
public class Client {
	public static void main(String[] args){
		SchoolReport schoolReport;
		
		schoolReport = new ForthGradeSchoolReport();
		schoolReport = new ScoreDecorator(schoolReport);//��ΪҪװ�ε�ԭ���е��¹���1
		schoolReport = new SortDecorator(schoolReport);//��ΪҪװ�ε�ԭ���е��¹���2
		
		schoolReport.getReportInfo();
		schoolReport.parentSign("�ҳ�������");
	}
}
