package net.mamian.designpattern.状态模式;

public class Work {
	private int hour;
	private State currentState;
	
	public Work(){
		this.currentState = new MorningState();
	}
	
	public void workCode(){
		this.currentState.Coding(this);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
}
