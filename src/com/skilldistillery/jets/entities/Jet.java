package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jet {
	private String jetType;
	private String model;
	private double speedInMph;
	private int rangeInMiles;
	private long priceInUsd;

	public Jet() {
	}

	public Jet(String jetType, String model, double speedInMph, int rangeInMiles, long priceInUsd) {
		this.jetType = jetType;
		this.model = model;
		this.speedInMph = speedInMph;
		this.rangeInMiles = rangeInMiles;
		this.priceInUsd = priceInUsd;
	}

	public abstract void fly();

	public String getJetType() {
		return jetType;
	}

	public void setJetType(String jetType) {
		this.jetType = jetType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeedInMph() {
		return speedInMph;
	}

	public void setSpeedInMph(double speedInMph) {
		this.speedInMph = speedInMph;
	}

	public int getRangeInMiles() {
		return rangeInMiles;
	}

	public void setRangeInMiles(int rangeInMiles) {
		this.rangeInMiles = rangeInMiles;
	}

	public long getPriceInUsd() {
		return priceInUsd;
	}

	public void setPriceInUsd(long priceInUsd) {
		this.priceInUsd = priceInUsd;
	}



	@Override
	public String toString() {
		return "Jet [model=" + model + ", speedInMph=" + speedInMph + ", rangeInMiles=" + rangeInMiles + ", priceInUsd="
				+ priceInUsd + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(jetType, model, priceInUsd, rangeInMiles, speedInMph);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(jetType, other.jetType) && Objects.equals(model, other.model)
				&& priceInUsd == other.priceInUsd && rangeInMiles == other.rangeInMiles
				&& Double.doubleToLongBits(speedInMph) == Double.doubleToLongBits(other.speedInMph);
	}

}
