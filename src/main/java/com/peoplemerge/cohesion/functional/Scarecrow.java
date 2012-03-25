package com.peoplemerge.cohesion.functional;

public class Scarecrow {

	private enum Brain{
		//TODO change EMPTY to SEEMS_EMPTY
		EMPTY,FULL;
	}
	
	private Brain brain;
	
	public Scarecrow(){
		brain = Brain.EMPTY;
	}
	
	
	// What the scarecrow thinks
	public boolean canMakeUpMind(){
		return brain == Brain.FULL;
	}
	
	// What the scarecrow thinks
	public boolean isScary(){
		return brain == Brain.FULL;
	}
	
	// What the scarecrow thinks
	public boolean isFailure(){
		return brain == Brain.EMPTY;
	}
	
	public void setBrain(boolean whatIwant){
		brain = Brain.FULL;
	}
	
}
