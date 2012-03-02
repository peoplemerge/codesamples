package com.peoplemerge.coupling.control;

public class Dorothy {

	// WickedWitch is control-coupled to Dorothy since Dorothy controls the
	// internal logic of the WickedWitch by passing in a flag.

	public void startAdventure() {
		String blahBlah = new WickedWitch().speak(true);
		System.out.println(blahBlah);
	}

	public void endAdventure() {
		String blahBlah = new WickedWitch().speak(false);
		System.out.println(blahBlah);
	}

}
