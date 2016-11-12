package net.mamian.designpattern.门面模式;

public class PostOffice {
	private WriteLetterInterface writeLetter = new WriteLetterImpl();
	public void mySend(String title,String content,String address) {
		writeLetter.setTitle(title);
		writeLetter.setContent(content);
		writeLetter.setAddress(address);
		writeLetter.sendLetter();
	}
}
