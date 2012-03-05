package com.peoplemerge.coupling.messagebyinterface;


public class Toto {

	public void listen() {
		// Toto's listen method is message-coupled to Dorthy by the speak method. With
		// message coupling, you call another object through a public interface.
		speaker.speak();
	}
	
	private CanSpeak speaker;

	public Toto(CanSpeak speaker) {
		this.speaker = speaker;
	}

}
