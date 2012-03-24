package com.peoplemerge.cohesion.temporal;

public class Oz {


	Dorothy dorothy = new Dorothy();
	YellowBrickRoad yellowBrickRoad = new YellowBrickRoad();

	
	public Oz(){
		initializeWorld();
		dorothy.follow(yellowBrickRoad);
	}


	private void initializeWorld() {
		House dorthysHouse = dorothy.getHouse();
		Toto toto = new Toto();
		WickedWitchOfTheEast eastWitch = new WickedWitchOfTheEast();
		Glinda glinda = new Glinda();
		Munchkins munchkins = new Munchkins();
		
		dorthysHouse.landOn(eastWitch);
		eastWitch.die();
		
		dorothy.leave(dorthysHouse);
		munchkins.notifyTheresANewWitch(glinda).andRequestAssessmentOf(dorothy);
		dorothy.lookAt(this);
		munchkins.lookAt(dorothy);
		dorothy.speakTo(toto, "Toto, I have the feeling we're not in Kansas anymore.");
		dorothy.speakTo(toto, "We must be over the rainbow.");
		glinda.arriveByBubble();
		
		glinda.speakTo(dorothy, "Are you a good witch or a bad witch?");
		dorothy.speakTo(glinda, "I'm not a witch at all.");
		glinda.speakTo(munchkins, "Let the joyous news be spread the wicked old witch at last is dead!");

		WickedWitchOfTheWest westWitch = new WickedWitchOfTheWest();
		westWitch.arriveInPuffOfSmoke();
		dorothy.speakTo(glinda, "I though you said she was dead.");
		glinda.speakTo(dorothy, "That was her sister, the wicked witch of the East.  This is the Wicked Witch of the West");
		westWitch.speakTo(glinda, "Who killed my sister?");
		westWitch.speakTo(dorothy, "Who killed the witch of the east? Was it you?");
		dorothy.speakTo(westWitch, "No, I didn't mean to kill anybody. It was an accident");
		
		westWitch.speakTo(dorothy, "Just try to stay out of my way... Just try!  I'll get you, my pretty, and your little dog, too");
		glinda.speakTo(dorothy, "That was her sister, the wicked witch of the East.  This is the Wicked Witch of the West");
		westWitch.leaveByPuffOfSmoke();
	}
}
