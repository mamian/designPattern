package net.mamian.designpattern.ÃüÁîÄ£Ê½;

public class AddRequirementCommand extends Command{
	@Override
	public void runCommand() {
		super.requirementGroup.find();
		super.requirementGroup.add();
		super.requirementGroup.exe();
	}
}
