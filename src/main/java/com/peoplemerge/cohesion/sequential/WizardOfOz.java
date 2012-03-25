package com.peoplemerge.cohesion.sequential;

public class WizardOfOz extends StoryChain {

	@Override
	protected void handle(Dorothy dorothy) {
		dorothy.dontHelp("Bring me her broomstick, and I'll grant your requests.");
	}

}
