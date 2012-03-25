package com.peoplemerge.cohesion.functional;

public class WizardOfOz {

	Dorothy dorothy = new Dorothy();
	Lion lion = new Lion();
	TinMan tinMan = new TinMan();
	Scarecrow scarecrow = new Scarecrow();
	
	public void grantWishes(){
		boolean diploma = true; 
		lion.setCourage(diploma);
		tinMan.setHeart(diploma);
		scarecrow.setBrain(diploma);
		dorothy.sendBackToKansas();
	}
}
