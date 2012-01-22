package com.peoplemerge.automotive;

/**
 * While it may be overengineering to seperate this into a different interface, I wanted to illustrate
 * proper use of ISP (Interface Segragation Principle).  Only motorized vehicles have engines, so
 * a pedal bike starts, stops, and has a top speed, but no engine!  ISP suggests that "fat" interfaces are
 * bad since they require clients to depend on interfaces that have no meaning.
 * @author dave
 *
 */
public interface MotorizedVehicle {
	
	/**
	 * 
	 * @return a string containing the engine type
	 */
	public String getEngineType();

}
