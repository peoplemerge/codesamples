package com.peoplemerge.cohesion.functional;

public class TinMan {

	private enum Heart{
		//TODO change EMPTY to SEEMS_EMPTY
		EMPTY,FULL;
	}
	
	private Heart heart;
	
	public TinMan(){
		heart = Heart.EMPTY;
	}
	
	// How Tin Man sees himself
	public boolean isKindAndHuman(){
		return heart == Heart.FULL;
	}
	
	// How Tin Man sees himself
	public boolean isSentimental(){
		return heart == Heart.FULL;
	}
	
	public void setHeart(boolean whatINeed){
		heart = Heart.FULL;
	}
	
}
