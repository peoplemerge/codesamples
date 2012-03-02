package com.peoplemerge.coupling.message;

import org.junit.Test;

public class TotoCoupledToDorothyTest {

	@Test
	public void dorothyTalksToToto() {
		Dorothy dorothy = new Dorothy();
		Toto toto = new Toto(dorothy);
		// Toto's job is to listen. If you look now at Toto.listen() you'll see
		// it calls Dorothy.speak(). 
		toto.listen();
		
		// If you want to dive further into detailed semantics, note that this
		// test class calls toto's public interface, but when you look at Toto,
		// it doesn't call Dorothy.speak() through Dorothy's public interface;
		// it calls Dorothy through the CanSpeak interface.
		
		// Therefore, we may accurately say the following:
		// 1.  This test is message-coupled to Toto through the Toto.listen() method. 
		// 2.  Toto is message-coupled to the CanSpeak interface.
		// 3.  This test assembles Toto and Dorothy so they are loosely coupled to
		// each other via the CanSpeak interface.
		
		// We will return to the role of the assembler with Inversion of Control. 
	}

}
