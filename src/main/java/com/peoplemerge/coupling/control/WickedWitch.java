package com.peoplemerge.coupling.control;

public class WickedWitch {

	public String speak(boolean startAdventure){
		OzLanguage ozLanguage = new OzLanguage();

		if (startAdventure){
			return ozLanguage.MEETS_WICKED_WITCH;
		} else {
			return ozLanguage.MELTS_WICKED_WITCH;
		}
	}
}
