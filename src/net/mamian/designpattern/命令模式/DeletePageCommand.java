package net.mamian.designpattern.����ģʽ;

public class DeletePageCommand extends Command{
	@Override
	public void runCommand() {
		super.pageGroup.find();
		super.pageGroup.delete();
		super.pageGroup.exe();
	}
}
