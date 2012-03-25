package com.peoplemerge.cohesion.sequential;

public class AuntEm extends StoryChain {

	public AuntEm(StoryChain next){
		setNext(next);
	}
	
	@Override
	protected void handle(Dorothy dorothy) {
		dorothy.dontHelp("We're busy now");
	}

}
