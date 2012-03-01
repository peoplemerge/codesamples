package com.peoplemerge.automotive;

/**
 * Hello world!
 * 
 */
public class Automobile implements MovingVehicle, MotorizedVehicle {
	private final AccelerationBehavior accelerationBehavior;
	private final StoppingBehavior stoppingBehavior;
	private final EngineTypeBehavior engineTypeBehavior;
	private final int topSpeedMph;

	private Automobile(AccelerationBehavior accelerationBehavior,
			StoppingBehavior stoppingBehavior,
			EngineTypeBehavior engineTypeBehavior, int topSpeedMph) {
		this.accelerationBehavior = accelerationBehavior;
		this.stoppingBehavior = stoppingBehavior;
		this.engineTypeBehavior = engineTypeBehavior;
		this.topSpeedMph = topSpeedMph;
	}

	public String accelerate() {
		return accelerationBehavior.accelerate();
	}

	public String stop() {
		return stoppingBehavior.stop();
	}

	public int getTopSpeedMph() {
		return topSpeedMph;
	}

	public String getEngineType() {
		return engineTypeBehavior.getEngineType();
	}

	public static class Factory {
		public static Automobile buildSemiTruck() {
			return new Automobile(AccelerationBehavior.SLOW,
					StoppingBehavior.STOPPING_SLOWLY,
					EngineTypeBehavior.DIESEL,
					80);
		}

		public static Automobile buildFerrari458() {
			return new Automobile(AccelerationBehavior.REALLY_FAST,
					StoppingBehavior.STOPPING_FAST,
					EngineTypeBehavior.GASOLINE,
					210);
		}

		public static Automobile buildHondaS2000() {
			return new Automobile(AccelerationBehavior.FAST,
					StoppingBehavior.STOPPING,
					EngineTypeBehavior.GASOLINE,
					141);
		}

		public static Automobile buildToyotaPrius() {
			return new Automobile(AccelerationBehavior.SLOW,
					StoppingBehavior.STOPPING,
					EngineTypeBehavior.HYBRID,
					120);
		}

		public static Automobile buildMazdaRx8() {
			return new Automobile(AccelerationBehavior.FAST,
					StoppingBehavior.STOPPING,
					EngineTypeBehavior.ROTARY,
					135);
		}

		public static Automobile buildMazdaRx7() {
			return new Automobile(AccelerationBehavior.REALLY_FAST,
					StoppingBehavior.STOPPING_FAST,
					EngineTypeBehavior.ROTARY,
					165);
		}

		public static Automobile buildHondaInsight() {
			return new Automobile(AccelerationBehavior.SLOW,
					StoppingBehavior.STOPPING,
					EngineTypeBehavior.HYBRID,
					120);
		}

	}

}
