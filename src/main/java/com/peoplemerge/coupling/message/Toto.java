package com.peoplemerge.coupling.message;

public class Toto {

	private Dorothy dorothy = new Dorothy();
	
	public void listen() {
		// Toto's listen method is message-coupled to Dorthy by the speak method. With
		// message coupling, you call another object through a public interface.
		dorothy.speak();
	}


}
