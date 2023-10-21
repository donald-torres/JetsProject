package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApp {

	public static void main(String[] args) {
		JetsApp app = new JetsApp();
		app.launch();

	}

	public void launch() {
		Scanner kb = new Scanner(System.in);
		AirField airFld = new AirField();
		printMenu();
		int userInput;
		do {
			userInput = kb.nextInt();

			switch (userInput) {
			case 1:
				airFld.listFleet();
				break;
			case 2:
				airFld.fly();
				break;
			case 3:
				airFld.fastestJet();
				break;
			case 4:
				airFld.longestRange();
				break;
			case 5:
				airFld.loadCargo();
				break;
			case 6:
				airFld.fight();
				break;
			case 7:
				airFld.addNewJet(kb);
				break;
			case 8:
				airFld.removeJet(kb);
				break;
			case 9:
				System.out.println("Goodbye, and thanks for visiting our Airfield!");
				kb.close();
				System.exit(0);
			default:
				System.out.println("Invalid Entry");
			}
			printMenu();
		} while (userInput != 9);

	}

	public void printMenu() {
		System.out.println("Select from the following options");
		System.out.println();
		System.out.println("/////////////////////////////////");
		System.out.println("/////////////////////////////////");
		System.out.println("/ 1. List Fleet                 /");
		System.out.println("/ 2. Fly all jets               /");
		System.out.println("/ 3. View fastest Jet           /");
		System.out.println("/ 4. View jet with longest range/");
		System.out.println("/ 5. Load all Cargo Jets        /");
		System.out.println("/ 6. DogFight!                  /");
		System.out.println("/ 7. Add jet to Fleet           /");
		System.out.println("/ 8. Remove a jet from Fleet    /");
		System.out.println("/ 9. Leave airfield             /");
		System.out.println("/////////////////////////////////");
		System.out.println("/////////////////////////////////");
	}
}
