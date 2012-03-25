package com.peoplemerge.cohesion.sequential;

public class UncleHenry extends StoryChain {

	public UncleHenry (StoryChain next){
		setNext(next);
	}
	@Override
	protected void handle(Dorothy dorothy) {
		dorothy.dontHelp("We're going to lose these chicks!");
	}

}
