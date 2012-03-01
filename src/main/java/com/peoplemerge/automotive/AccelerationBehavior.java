package com.peoplemerge.automotive;

/**
 * A good place to use the Strategy pattern.  This example may be trivial and may be simpler
 * to be done all in the Automobile class, but given that these behaviors will vary and are
 * in a real app going to be getting more complicated, let's seperate them out.
 * @author dave
 *
 */
public enum AccelerationBehavior {
	SLOW("slow"),
	FAST("fast"),
	REALLY_FAST("really-fast");
	private final String accelerationPerformance;

	private AccelerationBehavior(String accelerationPerformance){
		this.accelerationPerformance = accelerationPerformance;
	}
	public String accelerate() {
		return accelerationPerformance;
	}
}
