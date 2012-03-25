package com.peoplemerge.cohesion.sequential;

public class WizardOfOz extends StoryChain {

	public WizardOfOz(StoryChain next){
		setNext(next);
	}
	
	@Override
	protected void handle(Dorothy dorothy) {
		dorothy.dontHelp("Bring me her broomstick, and I'll grant your requests.");
	}

}
