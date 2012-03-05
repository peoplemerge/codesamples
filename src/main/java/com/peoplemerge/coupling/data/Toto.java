package com.peoplemerge.coupling.data;

public class Toto {

	private Dorothy dorothy = new Dorothy();

	// Toto is data-coupled to Dorothy which now passes back a String
	// With data coupling, an object passes only primitives to another  
	public void listen() {
		String blahBlah = dorothy.speak();
		System.out.println(blahBlah);
	}

}
