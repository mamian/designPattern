package net.mamian.designpattern.������ģʽ;

public class Women implements WomenInterface{
	private int type=0;//1δ����        2����        3����
	private String request = "";
	
	public Women(int type,String request){
		this.type = type;
		//Ϊ����ʾ�ÿ��㣬�����������˵㴦��
		switch(type){
			case 1:
				this.request = "Ů���������ǣ�" + request;
				break;
			case 2:
				this.request = "���ӵ������ǣ�" + request;
				break;
			case 3:
				this.request = "ĸ�׵������ǣ�" + request;
		}
	}
	
	@Override
	public int getType() {
		return type;
	}

	@Override
	public String getRequest() {
		return request;
	}
}
