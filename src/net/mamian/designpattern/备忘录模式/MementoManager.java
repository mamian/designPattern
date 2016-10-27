package net.mamian.designpattern.备忘录模式;

public class MementoManager {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
