package net.mamian.designpattern.����ģʽ;

public class AddRequirementCommand extends Command{
	@Override
	public void runCommand() {
		super.requirementGroup.find();
		super.requirementGroup.add();
		super.requirementGroup.exe();
	}
}
