package com.peoplemerge.coupling.content;

public enum WickedWitch implements Runnable{
	INSTANCE{};
	
	public volatile boolean isWet = false;
	
	public void burnScarecrow(){
		Scarecrow.INSTANCE.burn();
	}

	public void run() {
		while(true){
			if (isWet){
				throw new RuntimeException("I'm melting, melting!");
			}
		}
	}
	
}
