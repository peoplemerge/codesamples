package com.peoplemerge.coupling.content;

public enum Scarecrow {
	INSTANCE{};
	
	private boolean isBurning = false;
	
	public void burn(){
		isBurning = true;
		System.out.println("Help! Help!");	
	}
	
	public void getWet(){
		isBurning = false;
	}
	
}
