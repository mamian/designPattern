package net.mamian.designpattern.多例模式;

/*
 * 三个static变量：最大实例数量maxInstanceNum，当前实例编号nowInstanceNum，实例列表instanceList
 * 一个static代码块：此代码块中生成maxInstanceNum个实例，并将其添加到实例列表instanceList中
 * 构造方法为private
 * 一个static方法getInstance：获取0-maxInstanceNum间的一个随机整数random.nextInt(maxInstanceNum)，并从实例列表instanceList中获取索引为此随机数的实例
 * */
public class Client {
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			Multiton.getInstance();
			System.out.print("第"+(i+1)+"个大臣参拜的是：");
			Multiton.emperorInfo();
		}
	}
}
