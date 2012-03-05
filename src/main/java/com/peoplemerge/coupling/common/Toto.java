package com.peoplemerge.coupling.common;

public class Toto {

	public void listen(){
		Dorothy dorothy = new Dorothy();
		dorothy.speak();
		System.out.println(OzLanguage.DIALOG_ON_SCREEN);
		WickedWitch wickedWitch = new WickedWitch();
		wickedWitch.speak();
		System.out.println(OzLanguage.DIALOG_ON_SCREEN);
	}
	
}
