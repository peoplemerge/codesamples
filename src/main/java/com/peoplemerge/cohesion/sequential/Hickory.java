package com.peoplemerge.cohesion.sequential;

public class Hickory extends StoryChain {

	public Hickory (StoryChain next){
		setNext(next);
	}
	@Override
	protected void handle(Dorothy dorothy) {
		dorothy.dontHelp("Listen, Dorothy, don't let Hunk kid you"
				+ "about Miss Gulch. She's just a poor"
				+ "sour-faced old maid that -- she ain't got"
				+ "no heart left.");
	}

}
