package com.peoplemerge.cohesion.sequential;

public class Scarecrow extends StoryChain {

	@Override
	protected void handle(Dorothy dorothy) {
		dorothy.help("She's wearing the ruby slippers she gave her.");
	}

}
