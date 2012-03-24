package com.peoplemerge.automotive;

import junit.framework.Assert;

import org.junit.Test;

import com.peoplemerge.automotive.Automobile;
import com.peoplemerge.automotive.MotorizedVehicle;
import com.peoplemerge.automotive.MovingVehicle;


public class VehicleTest 
{

	/**
	 * Calling the Accelerate method for the Ferrari 458 should output "really fast"
	 */
	@Test
	public void testFerrariAcceleratesFast(){
		
		MovingVehicle ferrari = Automobile.Factory.buildFerrari458();
		String accelerateOutput = ferrari.accelerate();
		Assert.assertEquals("really-fast", accelerateOutput);
	}
	
	
	/**
	 * Calling stop for the Semi-truck should output "stopping-slowly"
	 */

	@Test
	public void testSemiStopsSlowly(){
		MovingVehicle semi = Automobile.Factory.buildSemiTruck();
		String stoppingOutput = semi.stop();
		Assert.assertEquals("stopping-slowly", stoppingOutput);		
	}


	/**
	 * Really just a sanity check that my interfaces look good.
	 */
	@Test
	public void testHondaS2000TopSpeed(){
		MovingVehicle s2000 = Automobile.Factory.buildHondaS2000();
		int topSpeed = s2000.getTopSpeedMph();
		Assert.assertEquals(141, topSpeed);		
	}

	/**
	 * Tests that this interface looks good.  Yes it does.
	 */
	@Test
	public void testPriusIsHybrid(){
		MotorizedVehicle prius = Automobile.Factory.buildToyotaPrius();
		String engineType = prius.getEngineType(); 
		Assert.assertEquals("hybrid", engineType);		
	}

}
