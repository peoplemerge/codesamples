package com.peoplemerge.cohesion.sequential;

public class Witch extends StoryChain {

	@Override
	protected void handle(Dorothy dorothy) {
		dorothy.harm("I'll get you my pretty.  And your little dog too.");
	}

}
