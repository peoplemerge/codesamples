package com.peoplemerge.cohesion.sequential;

public class Lion extends StoryChain {

	public Lion (StoryChain next){
		setNext(next);
	}
	@Override
	protected void handle(Dorothy dorothy) {
		dorothy.help("She - she can have my Witch Remover.");
	}

}
