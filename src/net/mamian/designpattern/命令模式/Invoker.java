package net.mamian.designpattern.����ģʽ;

public class Invoker {
	private Command command;
	public void setCommand(Command command){
		this.command = command;
	}
	public void action(){
		this.command.runCommand();
	}
}
