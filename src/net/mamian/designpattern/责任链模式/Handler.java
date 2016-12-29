package net.mamian.designpattern.������ģʽ;

public abstract class Handler {
	//�ܴ���ļ���
	private int level =0;
	//���δ��ݣ���һ������������˭
	private Handler nextHanlder;
	
	//ÿ���඼Ҫ˵��һ���Լ��ܴ�����Щ����
	public Handler(int level){
		this.level = level;
	}
	public final void HandleMessage(WomenInterface women){
		if(women.getType() == this.level){
			this.response(women);
		}else{
			if(this.nextHanlder != null){ //�к������ڣ��Ű������������
				this.nextHanlder.HandleMessage(women);
			}else{ //�Ѿ�û�к����������ˣ����ô�����
				System.out.println("-----------û�ط���ʾ�ˣ���������---------\n");
			}
		}
	}
	
	public void setNext(Handler _handler){
		this.nextHanlder = _handler;
	}
	
	//����ʾ�ǵ�ȻҪ��Ӧ
	public abstract void response(WomenInterface women);
}
