package com.peoplemerge.coupling.content;

public class Dorothy {
	
	public void putOutBurningScarecrow(){
		System.out.println("Ohh!  OHH!  OHH!");
		throwWater();
	}
	
	public void throwWater(){
		Scarecrow.INSTANCE.getWet();
		WickedWitch.INSTANCE.isWet = true;
	}
	
}
