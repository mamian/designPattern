package net.mamian.designpattern.建造者模式;

import java.util.ArrayList;

public abstract class Builder {
	public abstract void setSequence(ArrayList<String> sequence);
	public abstract Model getModel();
}
