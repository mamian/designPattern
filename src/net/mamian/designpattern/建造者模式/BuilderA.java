package net.mamian.designpattern.������ģʽ;

import java.util.ArrayList;

public class BuilderA extends Builder{
	private ModelA modelA = new ModelA();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		modelA.setSequence(sequence);
	}

	@Override
	public Model getModel() {
		return modelA;
	}

}
