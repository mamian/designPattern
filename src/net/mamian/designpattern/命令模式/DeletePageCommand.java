package net.mamian.designpattern.ÃüÁîÄ£Ê½;

public class DeletePageCommand extends Command{
	@Override
	public void runCommand() {
		super.pageGroup.find();
		super.pageGroup.delete();
		super.pageGroup.exe();
	}
}
