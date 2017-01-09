package net.mamian.designpattern.门面模式;

public class WriteLetterImpl implements WriteLetterInterface{
	@Override
	public void setTitle(String title) {
		System.out.println("写信的标题:"+title);
	}

	@Override
	public void setContent(String content) {
		System.out.println("写信的内容:"+content);
	}

	@Override
	public void setAddress(String address) {
		System.out.println("写收信人地址:"+address);
	}

	@Override
	public void sendLetter() {
		System.out.println("开始发送信件");
	}

}
