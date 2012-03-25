package com.peoplemerge.cohesion.communication;

public class QuestHandler {

	private QuestBean questBean = new QuestBean();

	private void accomplishNothing() {
		System.out.println("That accomplishes nothing");
	}

	public QuestBean handle(Operation in, String message) {
		/*
		 * This operation features communication cohesion because it handles all
		 * Operations possible (input communication). Also it persists state
		 * using with the QuestBean.addAccomplishment (output communication).
		 * Notice how hard it is to correlate the message inputted to the output
		 * of system.out.println.  
		 */
		questBean.load();
		switch (in) {
		case ASK_FOR_HELP:
			accomplishNothing();
			System.out
					.println("Think you didn't have any brains at all.  Why don't you use them?  When you "
							+ "come home, don't go by Miss Gulch's place.  Then Toto won't get in her garden, and "
							+ "you won't get in no trouble.  See?");
			break;
		case GO_TO_OZ_AND_CRUSH_WITCH_OF_EAST:
			questBean.addAccomplishment(in, message);
			questBean.save();
			System.out
					.println("Let the joyous news be spread the wicked old witch at last is dead!");
			break;
		case ASK_WITCH_OF_NORTH_FOR_HELP_BEFORE_WITCH_OF_WEST_THREATENS:
			accomplishNothing();
			System.out
					.println("I'll get you, my pretty.  And your little dog, too!");
			break;
		case FIND_WIZARD_OF_OZ:
			accomplishNothing();
			System.out.println("I am the Great Wizard of Oz. Come forward!");
			break;
		case GET_CAPTURED_BY_WITCH:
			questBean.addAccomplishment(in, message);
			questBean.save();
			System.out.println("Oh, please give me back my dog!");
			break;
		case GET_RESCUED_BY_FRIENDS:
			accomplishNothing();
			System.out.println("Lion, darling -- I knew you'd come!");
			break;
		case ACCIDENTALLY_KILL_ANOTHER_WITCH:
			questBean.addAccomplishment(in, message);
			questBean.save();
			System.out.println("I'm melting, melting!");
			break;
		case CLICK_HEELS:
			questBean.addAccomplishment(in, message);
			questBean.save();
			System.out
					.println("If I ever go looking for my heart's desire again, I won't"
							+ " look any further than my own backyard.  Because if it isn't there,"
							+ " I never really lost it to begin with!");
			break;
		default:
			System.out.println("Operation not supported");
			break;
		}
		return questBean;
	}
}
