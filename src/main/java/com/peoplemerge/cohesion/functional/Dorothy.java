package com.peoplemerge.cohesion.functional;

public class Dorothy {

	private enum Location{
		KANSAS, OZ;
	}
	private Location location = Location.OZ;
	
	public boolean isHappy(){
		return location == Location.KANSAS;
	}
	
	public void sendBackToKansas(){
		location = Location.KANSAS;
	}
	
}
