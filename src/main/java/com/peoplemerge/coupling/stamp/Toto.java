package com.peoplemerge.coupling.stamp;

public class Toto {

	private Dorothy dorothy = new Dorothy();

	// CanSpeak and Dorothy now make Toto stamp-coupled to the OzLanguage. This
	// is unnecessary since Dorothy could have just passed Toto the String
	// containing the message.
	public void listen() {
		String blahBlah = dorothy.getLanguage().LIONS_TIGERS_BEARS;
		System.out.println(blahBlah);
	}

}
