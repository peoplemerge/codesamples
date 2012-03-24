package com.peoplemerge.cohesion.procedural;




public class Story {
	
	public void tell(){
		Kansas kansas = new Kansas();
		kansas.dorothyRunsHome();
		kansas.dorothyAsksRelativesForHelp();
		kansas.dorothyAsksLaborersForHelp();
		kansas.houseCaughtInTornado();
		
		Oz oz = new Oz();
		oz.dorothyArrives();
		oz.dorothyMeetsSecondWitch();
		oz.thirdWitchThreatensDorothy();
		oz.dorothyStartsQuest();
	}

}
