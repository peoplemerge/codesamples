package com.peoplemerge.automotive;

/**
 * A good place to use the Strategy pattern
 * @author dave
 *
 */

public enum EngineTypeBehavior {
	DIESEL("diesel"),
	HYBRID("hybrid"),
	ROTARY("rotary"),
	GASOLINE("gasoline");

	private final String engineType;

	private EngineTypeBehavior(String engineType){
		this.engineType = engineType;
	}
	public String getEngineType() {
		return engineType;
	}
}
