package com.peoplemerge.cohesion.sequential;

public class Witch extends StoryChain {

	public Witch (StoryChain next){
		setNext(next);
	}
	@Override
	protected void handle(Dorothy dorothy) {
		dorothy.threaten("I'll get you my pretty.  And your little dog too.");
	}

}
