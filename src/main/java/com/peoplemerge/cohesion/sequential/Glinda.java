package com.peoplemerge.cohesion.sequential;

public class Glinda extends StoryChain {

	public Glinda (StoryChain next){
		setNext(next);
	}
	
	@Override
	protected void handle(Dorothy dorothy) {
		System.out.println();
		dorothy.help("Aren't you forgetting the ruby slippers?  Here they are!");
		dorothy.dontHelp("I'm afraid you've made rather a bad enemy of the Wicked Witch of the West.");
		dorothy.dontHelp("The sooner you get out of Oz altogether, the safer you'll sleep, my dear.");
		dorothy.help("Close your eyes, and tap your heels, together three times");
	}

}
