package com.peoplemerge.coupling.data;

import org.junit.Test;

public class TotoCoupledToDorothyTest {

	@Test
	public void dorothyTalksToToto() {
		Dorothy dorothy = new Dorothy();
		Toto toto = new Toto(dorothy);
		// Toto's job is to listen. If you look now at Toto.listen() you'll see
		// it calls Dorothy.speak(). 
		toto.listen();
	}

}
