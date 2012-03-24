package com.peoplemerge.cohesion.procedural;

public class Kansas {
	/*
	 * Process elements on the basis of procedural or algorithmic relationships.
	 * Results from many practices that emphasize sequence method, efficiency,
	 * such as a flowchart or UML sequence diagram. The sequential relationship
	 * among the functions may have been implied by the problem statement or
	 * requirements.
	 */

	/*
	 * Sequences of functions that are to be performed when some condition is
	 * met. To fully understand this class, you must know something about (1)
	 * the overall program from which this class was taken, and (2) something
	 * about the conditions that cause the methods of this class to be called.
	 * Without understanding both of these point, modifying this module is
	 * likely to be error-prone. It's also probably not reusable since objects
	 * were designed specifically for this one application.
	 */
	
	/*
	 * actions are related by flow of execution rather than by one
	 * problem-related function. They may contain a group of functions which
	 * make up part of a larger function, but as a group perform no real
	 * function. Some of the public interfaces of objects may be procedurally
	 * cohesive because methods appear to be a sequence of functions that are
	 * performed when a particular condition is met. Temporally cohesive modules
	 * are similar to procedurally cohesive modules.
	 * 
	 * Compared to temporal: Both make poor black boxes because their
	 * functionality cannot be stated simply without knowing the internals of
	 * the modules. Coupling in both types of modules tends to be poor. They
	 * differ in the order of execution of activities. The order of execution is
	 * important in procedurally cohesive modules. It is not important in
	 * temporally cohesive modules. Also, temporally cohesive modules usually
	 * contain sequential statements while procedurally cohesive modules often
	 * share repetitions and conditions between activities.
	 */

	/*
	 * ex. a function which checks file permissions and then opens the file
	 */

	/*
	 * ex. method that puts settings in a hashtable, then follows by saving the
	 * hashtable in a file.
	 */
	/*
	 * ex. (1) write record B, (2) read record A, (3) format A for printing.
	 */
	
	private Dorothy dorothy = new Dorothy();
	
	public void dorothyRunsHome(){
		
	}
	
	public void dorothyAsksRelativesForHelp(){
		
	}
	
	public void dorothyAsksLaborersForHelp(){
		
	}
	
	public void missGulchThreatensDorothy(){
		
	}
	
	public void houseCaughtInTornado(){
		
	}
}
