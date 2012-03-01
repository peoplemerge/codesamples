package com.peoplemerge.automotive;

/**
 * This interface for a vehicle that relate to its speed
 * @author dave
 *
 */
public interface MovingVehicle {

	/**
	 * Cause the vehicle to accelerate.  
	 * @return how well it accelerates
	 */
	public String accelerate();

	/**
	 * Stop the Vehicle.
	 * @return how quickly it stops
	 */
	public String stop();

	/**
	 * Return the top speed in Miles per Hour.  Normally I would name this getTopSpeed, not getTopSpeedMph but I wanted to err on the side of clarity, and I figure an int is going to be most useful to the client.
	 * @return
	 */
	public int getTopSpeedMph();


}