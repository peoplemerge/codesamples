package com.peoplemerge.automotive;

/**
 * A good place to use the Strategy pattern
 * @author dave
 *
 */

public enum StoppingBehavior {
	STOPPING_SLOWLY("stopping-slowly"),
	STOPPING("stopping"),
	STOPPING_FAST("stopping-fast");
	private final String stoppingPerformance;

	private StoppingBehavior(String stoppingPerformance){
		this.stoppingPerformance = stoppingPerformance;
	}
	public String stop() {
		return stoppingPerformance;
	}
}
