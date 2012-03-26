package com.peoplemerge.cohesion.communication;

public class QuestHandler {

	private QuestBean questBean = new QuestBean();

	private void accomplishNothing() {
		System.out.println("That accomplishes nothing");
	}

	/**
	 * These operations feature communication cohesion because they handles all
	 * input to the Bean's State possible (input communication) and persist
	 * state using with the QuestBean.addAccomplishment.
	 * 
	 * They also all consistently return a State object (output communication)
	 * 
	 * But notice how hard it is to correlate the message inputted to the output
	 * of system.out.println.
	 */

	public State askForHelp(QuestBean questBean2, String string) {
		accomplishNothing();
		System.out
				.println("Think you didn't have any brains at all.  Why don't you use them?  When you "
						+ "come home, don't go by Miss Gulch's place.  Then Toto won't get in her garden, and "
						+ "you won't get in no trouble.  See?");
		return State.ASKED_FOR_HELP;
	}

	public State goToOz(QuestBean questBean2, String message) {
		questBean.load();
		State state = State.GONE_TO_OZ_AND_CRUSHED_WITCH_OF_EAST;
		questBean.addAccomplishment(state, message);

		System.out
				.println("Let the joyous news be spread the wicked old witch at last is dead!");
		questBean.save();
		return state;
	}

	public State gotToMeetWitches(QuestBean questBean, String message) {
		accomplishNothing();
		State state = State.ASK_WITCH_OF_NORTH_FOR_HELP_BEFORE_WITCH_OF_WEST_THREATENS;
		System.out
				.println("I'll get you, my pretty.  And your little dog, too!");
		return state;
	}

	public State killAnotherWitch(QuestBean questBean, String message) {
		questBean.load();
		State state = State.ACCIDENTALLY_KILL_ANOTHER_WITCH;
		questBean.addAccomplishment(state, message);
		questBean.save();
		System.out.println("I'm melting, melting!");
		return state;
	}
}
