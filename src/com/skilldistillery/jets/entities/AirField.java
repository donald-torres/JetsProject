package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AirField {
	Scanner kb = new Scanner(System.in);
	String fileName = "jets.txt";
	private List<Jet> fleet = readList(fileName);

	public AirField() {
	}

	public void listFleet() {
		int counter = 1;

		for (Jet jet : fleet) {
			System.out.println(counter + ": " + jet);
			counter++;
		}

	}

	public void fly() {
		int flyTime = 0;

		for (Jet jet : fleet) {
			flyTime = (int) jet.getRangeInMiles() / (int) jet.getSpeedInMph();
			System.out.println(jet + ". Takes off and has a flight time of " + flyTime + " Hours before it runs out of fuel");

		}

	}

	public void fastestJet() {
		int fastestSpeed = 0;
		Jet fastestJet = null;

		for (Jet jet : fleet) {
			if (fastestSpeed < (int) jet.getSpeedInMph()) {
				fastestSpeed = (int) jet.getSpeedInMph();
				fastestJet = jet;
			}
		}
		System.out.println("The fastest jet goes " + fastestSpeed + " MPH and is the " + fastestJet);

	}

	public void longestRange() {
		int longestRange = 0;
		Jet bestJet = null;

		for (Jet jet : fleet) {
			if (longestRange < jet.getRangeInMiles()) {
				longestRange = jet.getRangeInMiles();
				bestJet = jet;

			}
		}
		System.out.println("The jet flys the longest goes " + longestRange + " Miles on a full tank and is the" + bestJet);
	}

	public void loadCargo() {
		String currentJet = null;

		for (Jet jet : fleet) {
			if (jet instanceof CargoJet) {
				currentJet = jet.getModel();
				CargoJet cargoJet = (CargoJet) jet;
				System.out.print("Cargo Jet " + currentJet + ", ");
				cargoJet.loadTheCargo();

			}

		}

	}

	public void fight() {
		String currentJet = null;

		for (Jet jet : fleet) {
			if (jet instanceof FighterJet) {
				currentJet = jet.getModel();
				FighterJet fighterJet = (FighterJet) jet;
				System.out.print("Fighter Jet " + currentJet + ", ");
				fighterJet.dogFight();

			}

		}

	}

	public List<Jet> addNewJet(Scanner kb) {
		int userInput;
		Jet inputJet = null;
		String type;
		String name;
		double speedInMph;
		int rangeInMiles;
		long priceInUsd;

		System.out.println("What kind of plane would you like to make? \n 1: Fighter \n 2: Cargo \n 3: Private");
		userInput = kb.nextInt();
		kb.nextLine();

		switch (userInput) {

		case 1:
			type = "Fighter";
			try {
				System.out.println("You selected fighter jet, what's the model of the jet? ");
				name = kb.nextLine();
				System.out.println("What is the speed in MPH of your plane? ");
				speedInMph = kb.nextDouble();
				kb.nextLine();
				System.out.println("What is the range in miles of your plane? ");
				rangeInMiles = kb.nextInt();
				kb.nextLine();
				System.out.println("What is the price of your plane? ");
				priceInUsd = kb.nextLong();
				kb.nextLine();
				inputJet = new FighterJet(type, name, speedInMph, rangeInMiles, priceInUsd);
				fleet.add(inputJet);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid entry");
			}
		case 2:
			type = "Cargo";
			try {
				System.out.println("You selected cargo jet, what's the model of the jet? ");
				name = kb.nextLine();
				System.out.println("What is the speed in MPH of your plane? ");
				speedInMph = kb.nextDouble();
				kb.nextLine();
				System.out.println("What is the range in miles of your plane? ");
				rangeInMiles = kb.nextInt();
				kb.nextLine();
				System.out.println("What is the price of your plane? ");
				priceInUsd = kb.nextLong();
				kb.nextLine();
				inputJet = new CargoJet(type, name, speedInMph, rangeInMiles, priceInUsd);
				fleet.add(inputJet);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid entry");
			}
		case 3:
			type = "Private";
			try {
				System.out.println("You selected private jet, what's the model of the jet? ");
				name = kb.nextLine();
				System.out.println("What is the speed in MPH of your plane? ");
				speedInMph = kb.nextDouble();
				kb.nextLine();
				System.out.println("What is the range in miles of your plane? ");
				rangeInMiles = kb.nextInt();
				kb.nextLine();
				System.out.println("What is the price of your plane? ");
				priceInUsd = kb.nextLong();
				kb.nextLine();
				inputJet = new PrivateJet(type, name, speedInMph, rangeInMiles, priceInUsd);
				fleet.add(inputJet);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid entry");
			}
		default:
			System.out.println("Invalid Entry");

		}

		return fleet;
	}

	public void removeJet(Scanner kb) {
		int userInput;
		boolean loop = true;
		int counter = 1;
		try {
			while (loop) {
				System.out.print("What plane would you like to remove input the number, or type 0 to quit: \n");

				for (Jet jet : fleet) {
					if (fleet.isEmpty()) {
						System.out.println("There are no jets in the airfield");
						loop = false;
					}
					System.out.println(counter + ": " + jet);
					counter++;
				}
				userInput = kb.nextInt();
				kb.nextLine();
				if (userInput == 0) {
					loop = false;
				} else {
					System.out.println("You have removed " + fleet.remove(userInput - 1));
					loop = false;
				}
			}

		} catch (InputMismatchException e) {
			System.out.println("Invalid entry");
		}
	}

	public List<Jet> readList(String fileName) {
		List<Jet> fleetHold = new ArrayList<>();

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;

			while ((line = bufIn.readLine()) != null) {

				String[] jet = line.split(", ");
				String type = jet[0];
				String name = jet[1];
				double speedInMph = Double.parseDouble(jet[2]);
				int rangeInMiles = Integer.parseInt(jet[3]);
				long priceInUsd = Long.parseLong(jet[4]);

				Jet inputJet = null;
				if (type.equals("Fighter")) {
					inputJet = new FighterJet(type, name, speedInMph, rangeInMiles, priceInUsd);

				} else if (type.equals("Cargo")) {
					inputJet = new CargoJet(type, name, speedInMph, rangeInMiles, priceInUsd);

				} else if (type.equals("Private")) {
					inputJet = new PrivateJet(type, name, speedInMph, rangeInMiles, priceInUsd);
				}
				fleetHold.add(inputJet);

			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return fleetHold;
	}

}
