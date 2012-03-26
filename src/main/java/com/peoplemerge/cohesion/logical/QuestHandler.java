package com.peoplemerge.cohesion.logical;

public class QuestHandler {


	private void accomplishNothing() {
		System.out.println("That accomplishes nothing");
	}

	public void handle(Operation in, String message) {
	
		switch (in) {
		case ASK_FOR_HELP:
			accomplishNothing();
			System.out
					.println("Think you didn't have any brains at all.  Why don't you use them?  When you "
							+ "come home, don't go by Miss Gulch's place.  Then Toto won't get in her garden, and "
							+ "you won't get in no trouble.  See?");
			break;
		case GO_TO_OZ_AND_CRUSH_WITCH_OF_EAST:
			System.out
					.println("Let the joyous news be spread the wicked old witch at last is dead!");
			break;
		case ASK_GLINDA_FOR_HELP_AS_WESTWITCH_THREATENS:
			accomplishNothing();
			System.out
					.println("I'll get you, my pretty.  And your little dog, too!");
			break;
		case FIND_WIZARD_OF_OZ:
			accomplishNothing();
			System.out.println("I am the Great Wizard of Oz. Come forward!");
			break;
		case GET_CAPTURED_BY_WITCH:
			System.out.println("Oh, please give me back my dog!");
			break;
		case GET_RESCUED_BY_FRIENDS:
			accomplishNothing();
			System.out.println("Lion, darling -- I knew you'd come!");
			break;
		case ACCIDENTALLY_KILL_ANOTHER_WITCH:
			System.out.println("I'm melting, melting!");
			break;
		case CLICK_HEELS:
			System.out
					.println("If I ever go looking for my heart's desire again, I won't"
							+ " look any further than my own backyard.  Because if it isn't there,"
							+ " I never really lost it to begin with!");
			break;
		default:
			System.out.println("Operation not supported");
			break;
		}
	}
}
