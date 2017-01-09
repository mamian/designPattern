package net.mamian.designpattern.门面模式;

public interface WriteLetterInterface{
	public void setTitle(String title);
	public void setContent(String content);
	public void setAddress(String address);
	
	public void sendLetter();
}
