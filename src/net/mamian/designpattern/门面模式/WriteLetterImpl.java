package net.mamian.designpattern.����ģʽ;

public class WriteLetterImpl implements WriteLetterInterface{
	@Override
	public void setTitle(String title) {
		System.out.println("д�ŵı���:"+title);
	}

	@Override
	public void setContent(String content) {
		System.out.println("д�ŵ�����:"+content);
	}

	@Override
	public void setAddress(String address) {
		System.out.println("д�����˵�ַ:"+address);
	}

	@Override
	public void sendLetter() {
		System.out.println("��ʼ�����ż�");
	}

}
