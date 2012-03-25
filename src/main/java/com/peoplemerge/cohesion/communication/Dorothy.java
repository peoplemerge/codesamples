package com.peoplemerge.cohesion.communication;

public class Dorothy {

	QuestHandler questHandler = new QuestHandler();

	public void goOnAdventure() {
		QuestBean quest = null;
		quest = questHandler.handle(Operation.ASK_FOR_HELP, "Just listen to what Miss Gulch did to Toto!");
		
		quest = questHandler.handle(Operation.GO_TO_OZ_AND_CRUSH_WITCH_OF_EAST, "I don't think we're in Kansas anymore");
		quest = questHandler.handle(Operation.ASK_WITCH_OF_NORTH_FOR_HELP_BEFORE_WITCH_OF_WEST_THREATENS, "I didn't mean to kill anyone.  It was an accident.");
		quest = questHandler.handle(Operation.FIND_WIZARD_OF_OZ, "We'll soon find the Wizard.");
		quest = questHandler.handle(Operation.GET_CAPTURED_BY_WITCH,  "All in good time, my little pretty -- all in good time. Give me those slippers.");
		quest = questHandler.handle(Operation.GET_RESCUED_BY_FRIENDS, "Did they hurtcha?");
		quest = questHandler.handle(Operation.ACCIDENTALLY_KILL_ANOTHER_WITCH, "Help! I'm burning! I'm burning!");
		quest = questHandler.handle(Operation.CLICK_HEELS, "Now, those magic slippers will take you home in two seconds! Close your eyes, and tap your heels together three times.");

	}
}
