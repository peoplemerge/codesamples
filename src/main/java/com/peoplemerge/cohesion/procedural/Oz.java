package com.peoplemerge.cohesion.procedural;

public class Oz {

	
	private Munchkins munchkins = new Munchkins();
	private Glinda glinda = new Glinda();
	private Dorothy dorothy = new Dorothy();
	private Witch eastWitch = new Witch();
	private House dorthysHouse = dorothy.getHouse();
	private YellowBrickRoad yellowBrickRoad = new YellowBrickRoad();

	

	public void dorothyArrives(){
		dorthysHouse.landOn(eastWitch);
		eastWitch.die();
		dorothy.leave(dorthysHouse);
	}
	
	public void dorothyMeetsSecondWitch(){

		glinda.arriveByBubble();

		glinda.speakTo(dorothy, "Are you a good witch or a bad witch?");
		dorothy.speakTo(glinda, "I'm not a witch at all.");
		glinda
				.speakTo(munchkins,
						"Let the joyous news be spread the wicked old witch at last is dead!");
	}
	
	public void thirdWitchThreatensDorothy(){
		Witch westWitch = new Witch();
		westWitch.arriveInPuffOfSmoke();
		dorothy.speakTo(glinda, "I though you said she was dead.");
		glinda
				.speakTo(
						dorothy,
						"That was her sister, the wicked witch of the East.  " +
						"This is the Wicked Witch of the West");
		westWitch.speakTo(glinda, "Who killed my sister?");
		westWitch.speakTo(dorothy,
				"Who killed the witch of the east? Was it you?");
		dorothy.speakTo(westWitch,
				"No, I didn't mean to kill anybody. It was an accident");

		westWitch
				.speakTo(
						dorothy,
						"Just try to stay out of my way... Just try!  I'll get you, " +
						"my pretty, and your little dog, too");
		westWitch.leaveByPuffOfSmoke();
	}
	
	public void dorothyStartsQuest(){
		dorothy.follow(yellowBrickRoad);

	}
}
