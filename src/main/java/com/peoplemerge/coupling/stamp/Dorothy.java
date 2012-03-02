package com.peoplemerge.coupling.stamp;

public class Dorothy implements CanSpeak{

	public OzLanguage speak() {
		OzLanguage language = new OzLanguage();
		System.out.println(language.LIONS_TIGERS_BEARS);
		return language;
	}

}
