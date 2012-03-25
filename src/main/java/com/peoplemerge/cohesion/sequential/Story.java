package com.peoplemerge.cohesion.sequential;

public class Story {

	private StoryChain chain;
	private void assembleChain(){
		WizardOfOz wiz = new WizardOfOz(null);
		Lion lion = new Lion(wiz);
		TinMan tinMan = new TinMan(lion);
		Scarecrow scarecrow = new Scarecrow(tinMan);
		Witch witch = new Witch(scarecrow);
		Glinda glinda = new Glinda(witch);
		Zeke zeke = new Zeke(glinda);
		Hunk hunk = new Hunk(zeke);
		Hickory hickory = new Hickory(hunk);
		UncleHenry henry = new UncleHenry(hickory);
		AuntEm em = new AuntEm(henry);
		chain = em;
	}
	
	public void Story(){
		assembleChain();
	}

	// Story.tell() is where the real action happens
	public void tell(){
		Dorothy dorothy = new Dorothy();
		chain.handle(dorothy);
	}
}
