package com.peoplemerge.cohesion.functional;

public class Lion {

	private enum Courage{
		//TODO change EMPTY to SEEMS_EMPTY
		EMPTY,FULL
	}
	
	public Lion(){
		courage = Courage.EMPTY;
	}

	private Courage courage;
	
	// What the lion thinks
	public boolean isCoward(){
		return courage == Courage.EMPTY;
	}
	
	// He can't sleep without having courage
	public boolean canSleep(){
		return courage == Courage.FULL;
	}
	
	public void setCourage(boolean whatINeed){
		courage = Courage.FULL;
	}
	
}
