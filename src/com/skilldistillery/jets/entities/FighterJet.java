package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatPayload{
	
	public FighterJet(String jetType, String model, double speedInMph, int rangeInMiles, long priceInUsd ) {
		super(jetType, model, speedInMph, rangeInMiles, priceInUsd);
	}
	

	@Override
	public void fly() {
		
	}

	@Override
	public void dogFight() {
		System.out.println("Sidewinder on the way");
	}

	@Override
	public String toString() {
		return "Fighter Jet - Model: " + getModel() + ", Speed: " + getSpeedInMph() + " MPH, Range: " + getRangeInMiles()
		+ " Miles, Price: $" + getPriceInUsd();
	}

}
