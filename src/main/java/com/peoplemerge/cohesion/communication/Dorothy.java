package com.peoplemerge.cohesion.communication;

public class Dorothy {

	QuestHandler questHandler = new QuestHandler();

	public void goOnAdventure() {
		QuestBean questBean = new QuestBean();
		
		// Finally consider renaming questHandler to something else.
		State questState = questHandler.askForHelp(questBean, "Just listen to what Miss Gulch did to Toto!");
		System.out.println("helped: " + questState);
		questState = questHandler.goToOz(questBean, "I don't think we're in Kansas anymore");
		System.out.println("inOz: " + questState);
		questState = questHandler.gotToMeetWitches(questBean, "I didn't mean to kill anyone.  It was an accident.");
		System.out.println("metWitches: " + questState);
		
	}
}
