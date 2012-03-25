package com.peoplemerge.cohesion.sequential;

public class TinMan extends StoryChain {

	public TinMan  (StoryChain next){
		setNext(next);
	}
	
	@Override
	protected void handle(Dorothy dorothy) {
		dorothy.help("Don't cry, Dorothy!");
	}

}
