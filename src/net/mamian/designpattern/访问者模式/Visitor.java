package net.mamian.designpattern.访问者模式;

/**
 * 访问者
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-06 20:29:04
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Visitor implements VisitorInterface {

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


    //组装出基本信息
    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE ? "女" : "男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }

    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }
}