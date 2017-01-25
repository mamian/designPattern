package net.mamian.designpattern.备忘录模式;

/**
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-01-25 10:55:22
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Boy {
    private String name;
    private String age;
    private String sex;

    //private Memento memento;//此处的memento存储本类中那些需要备忘的属性信息
    public Memento createMemento() {
        return new Memento(name, age);
    }

    public void backMemento(Memento memento) {
        this.name = memento.getMementoName();
        this.age = memento.getMementoAge();
    }

    public void getBoyInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，性别：" + sex);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
