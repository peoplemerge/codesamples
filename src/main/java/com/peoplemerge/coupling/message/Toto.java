package com.peoplemerge.coupling.message;

public class Toto {

	public void listen() {
		// Toto's listen method is message-coupled to the CanSpeak speaker. With
		// message coupling, you call another object through a public interface.
		speaker.speak();
	}

	private CanSpeak speaker;

	public Toto(CanSpeak speaker) {
		this.speaker = speaker;
	}

}
