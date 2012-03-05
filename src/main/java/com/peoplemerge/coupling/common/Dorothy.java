package com.peoplemerge.coupling.common;

public class Dorothy {

	// Dorothy, WickedWitch, and Toto are common-coupled to each other through
	// the mutable public variable in OzLanguage.DIALOG_ON_SCREEN. This is how
	// global variables are sometimes seen in Java.

	public void speak() {

		OzLanguage.DIALOG_ON_SCREEN = "No -- No!  It was an accident!  I didn't mean to kill anybody!\n";

	}

}
