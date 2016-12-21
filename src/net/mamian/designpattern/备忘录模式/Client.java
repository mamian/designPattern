package net.mamian.designpattern.备忘录模式;

public class Client {
	public static void main(String[] args){
        Boy boy = new Boy();
        MementoManager mementoManager = new MementoManager();

        boy.setName("马面");
        boy.setAge("20");
        boy.setSex("男");

        Memento boyBack = boy.createMemento();
        mementoManager.setMemento(boyBack);//设置备忘管理类中的备忘类实例
        boy.getBoyInfo();//获取原始属性信息

        boy.setName("牛头");
        boy.setAge("25");
        boy.setSex("女");
        boy.getBoyInfo();//获取修改后的属性信息

        boy.backMemento(mementoManager.getMemento());
        boy.getBoyInfo();//获取恢复后的属性信息
    }
}
