package com.peoplemerge.cohesion.temporal;

public class Oz {

	Dorothy dorothy = new Dorothy();
	Glinda glinda = new Glinda();
	House dorthysHouse = dorothy.getHouse();
	Munchkins munchkins = new Munchkins();
	Toto toto = new Toto();
	Witch eastWitch = new Witch();

	public Oz() {
		/*
		 * So when does the world get initialized? At the TIME this object is
		 * constructed.Temporal cohesion means that all occurrences of all
		 * elements of processing in a collection occur within the same limited
		 * time during the execution of a system.
		 */
		initializeWorld();
	}

	/*
	 * When you performs multiple sequential functions, which are combined in a
	 * class or method based on the time they're executed such as a constructor,
	 * destructor, thread wakeup time, you have temporal cohesion.
	 */

	private void initializeWorld() {
		/*
		 * When the Oz object is instantiated, a number of things occur to
		 * initialize this world: the witch dies, Munchkins tell Glinda (the
		 * good witch of the North) that Dorothy is here, while Dorothy walks
		 * around this technicolor world and observes to Toto that they're not
		 * in Kansas. The important thing to note is that it doesn't matter the
		 * order that these operations occur since they all really happen either
		 * simultaneously or all around the same time period, but it's critical
		 * they all happen upon initialization. The story doesn't begin
		 */
		eastWitch.die();
		dorothy.leave(dorthysHouse);
		munchkins.notifyTheresANewWitch(glinda).andRequestAssessmentOf(dorothy);
		dorothy.lookAt(this);
		munchkins.lookAt(dorothy);
		dorothy.speakTo(toto,
				"Toto, I have the feeling we're not in Kansas anymore.  " +
				"We must be over the rainbow.");
		

	}
}
