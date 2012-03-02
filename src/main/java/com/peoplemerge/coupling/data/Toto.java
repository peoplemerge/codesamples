package com.peoplemerge.coupling.data;

public class Toto {

	// Toto is data-coupled to the speaker, namely Dorothy by the test case.
	// With data coupling, an object passes only primitives to another  
	public void listen() {
		String blahBlah = speaker.speak();
		System.out.println(blahBlah);
	}

	private CanSpeak speaker;

	public Toto(CanSpeak speaker) {
		this.speaker = speaker;
	}

}
