package com.peoplemerge.coupling.content;

public enum Scarecrow {
	INSTANCE{};
	
	private boolean isBurning = false;
	
	public void burn(){
		isBurning = true;
	}
	
	public void getWet(){
		isBurning = false;
	}
	
}
