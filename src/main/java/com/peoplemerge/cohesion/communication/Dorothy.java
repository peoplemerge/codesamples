package com.peoplemerge.cohesion.communication;

public class Dorothy {

	Quest quest = new Quest();

	public void goOnAdventure() {
		QuestBean questBean = new QuestBean();
		
		State questState = quest.askForHelp(questBean, "Just listen to what Miss Gulch did to Toto!");
		System.out.println("helped: " + questState);
		questState = quest.goToOz(questBean, "I don't think we're in Kansas anymore");
		//System.out.println("inOz: " + questState);
		questState = quest.gotToMeetWitches(questBean, "I didn't mean to kill anyone.  It was an accident.");
		//System.out.println("metWitches: " + questState);
		
	}
}
