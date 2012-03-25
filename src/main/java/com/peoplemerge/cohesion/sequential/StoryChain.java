package com.peoplemerge.cohesion.sequential;

public abstract class StoryChain {

	private StoryChain next;

	public void setNext(StoryChain next){
		this.next = next;
	}
	
	public final void process(Dorothy dorothy) {
		handle(dorothy);
		if (next != null) {
			next.process(dorothy);
		}
	}

	protected abstract void handle(Dorothy dorothy);
}
