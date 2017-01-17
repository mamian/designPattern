package net.mamian.designpattern.备忘录模式;

/*
 * 备忘录模式：并不是在类A中增加一个A对象的实例a，而是将要备忘的具体属性单独抽出来，存放到一个新类B中
 * A不需要包含备忘对象B，只需在A中增加一个新建备忘B对象和由备忘B对象恢复当前属性信息的方法
 * 
 * 
 * 本示例中最后的sex没有恢复是因为没有将此属性加入到Memento类中，sex为不需要恢复的属性
 * */
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
