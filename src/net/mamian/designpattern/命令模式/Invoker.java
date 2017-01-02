package net.mamian.designpattern.ÃüÁîÄ£Ê½;

public class Invoker {
	private Command command;
	public void setCommand(Command command){
		this.command = command;
	}
	public void action(){
		this.command.runCommand();
	}
}
