package com.peoplemerge.coupling.stamp;

public class Toto {

	// CanSpeak and Dorothy now make Toto stamp-coupled to the OzLanguage. This
	// is unnecessary since Dorothy could have just passed Toto the String
	// containing the message.
	public void listen() {
		String blahBlah = speaker.speak().LIONS_TIGERS_BEARS;
		System.out.println("I heard: " + blahBlah);
	}

	private CanSpeak speaker;

	public Toto(CanSpeak speaker) {
		this.speaker = speaker;
	}

}
