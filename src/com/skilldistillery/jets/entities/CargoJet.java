package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoHold {

	public CargoJet(String jetType, String model, double speedInMph, int rangeInMiles, long priceInUsd) {
		super(jetType, model, speedInMph, rangeInMiles, priceInUsd);
	}

	@Override
	public void fly() {

	}

	@Override
	public void loadTheCargo() {
		System.out.println("Loading Cargo....");
		System.out.println(".................");
		System.out.println(".....Cargo Loaded");
	}

	@Override
	public String toString() {
		return "Cargo Jet - Model: " + getModel() + ", Speed: " + getSpeedInMph() + " MPH, Range: " + getRangeInMiles()
				+ " Miles, Price: $" + getPriceInUsd();
	}

}
