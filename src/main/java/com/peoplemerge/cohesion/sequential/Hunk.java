package com.peoplemerge.cohesion.sequential;

public class Hunk extends StoryChain {

	public Hunk (StoryChain next){
		setNext(next);
	}
	
	@Override
	protected void handle(Dorothy dorothy) {
		
		dorothy.dontHelp("When you come home, don't go by Miss Gulch's place. " 
				+" Then Toto won't get in her garden, and you won't get in no "
				+ " trouble.  See?");
	}

}
