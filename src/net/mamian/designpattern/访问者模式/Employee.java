package net.mamian.designpattern.访问者模式;

/**
 * 访问者模式：
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-06 20:23:16
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public abstract class Employee {
    public final static int MALE = 0; //0代表是男性
    public final static int FEMALE = 1; //1代表是女性

    private String name;//甭管是谁，都有工资

    private int salary;//只要是员工那就有薪水

    private int sex;//性别很重要

    public abstract void accept(VisitorInterface visitor);//我允许一个访问者过来访问


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