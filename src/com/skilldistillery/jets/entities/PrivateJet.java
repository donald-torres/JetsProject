package com.skilldistillery.jets.entities;

public class PrivateJet extends Jet {

	public PrivateJet(String jetType, String model, double speedInMph, int rangeInMiles, long priceInUsd) {
		super(jetType, model, speedInMph, rangeInMiles, priceInUsd);
	}

	@Override
	public void fly() {

	}

	@Override
	public String toString() {
		return "Private Jet - Model: " + getModel() + ", Speed: " + getSpeedInMph() + " MPH, Range: " + getRangeInMiles()
				+ " Miles, Price: $" + getPriceInUsd();
	}

}
