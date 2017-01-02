package net.mamian.designpattern.������ģʽ;

import java.util.ArrayList;

public class BuilderB extends Builder{
	private ModelB modelB = new ModelB();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		modelB.setSequence(sequence);
	}

	@Override
	public Model getModel() {
		return modelB;
	}

}
