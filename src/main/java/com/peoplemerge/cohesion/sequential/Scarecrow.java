package com.peoplemerge.cohesion.sequential;

public class Scarecrow extends StoryChain {

	public Scarecrow  (StoryChain next){
		setNext(next);
	}
	@Override
	protected void handle(Dorothy dorothy) {
		dorothy.help("She's wearing the ruby slippers Glinda gave her.");
	}

}
