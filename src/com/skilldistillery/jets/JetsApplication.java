package com.skilldistillery.jets;

import java.util.List;
import java.util.Scanner;

public class JetsApplication {
	private static AirField airField = new AirField();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		populateAirField();
		initializeFleet();
		boolean running = true;

		while (running) {
			showMenu();
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				listFleet();
				break;
			case 2:
				flyAllJets();
				break;
			case 3:
				viewFastestJet();
				break;
			case 4:
				viewLongestRangeJet();
				break;
			case 5:
				loadAllCargoJets();
				break;
			case 6:
				dogfight();
				break;
			case 7:
				addJetToFleet();
				break;
			case 8:
				removeJetFromFleet();
				break;
			case 9:
				running = false;
				break;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}


	private static void populateAirField() {
		// Create instances of different Jet types
		Jet cargoJet1 = new CargoJet("C-130 Hercules", 336.0, 2360, 30000000, 50.0);
		Jet cargoJet2 = new CargoJet("Boeing 747 Cargo", 570.0, 4000, 200000000, 100.0);
		Jet fighterJet1 = new FighterJet("F-16 Fighting Falcon", 1500.0, 2000, 40000000, 6);
		Jet fighterJet2 = new FighterJet("Su-27 Flanker", 1550.0, 1800, 45000000, 8);
		Jet passengerJet = new PassengerJet("Boeing 737", 580.1, 3000, 10000000, 0);

		airField.addJet(cargoJet1);
		airField.addJet(cargoJet2);
		airField.addJet(fighterJet1);
		airField.addJet(fighterJet2);
		airField.addJet(passengerJet);

		System.out.println("AirField populated with 5 Jet instances.");
	}

	private static void initializeFleet() {
		airField.addJet(new PassengerJet("Boeing 737", 580.1, 3000, 10000000, 80));
		airField.addJet(new CargoJet("C-130 Hercules", 336, 2360, 30000000, 80));
		// Add more jets as needed
	}

	private static void showMenu() {
		System.out.println("\nJet Fleet Menu");
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
	}

	private static void listFleet() {
		List<Jet> jetFleet = airField.getAllJets();

		if (jetFleet.isEmpty()) {
			System.out.println("The fleet is empty.");
		} else {
			System.out.println("Jet Fleet:");
			for (Jet jet : jetFleet) {
				System.out.println("Model: " + jet.getModel());
				System.out.println("Speed: " + jet.getSpeed() + " MPH");
				System.out.println("Range: " + jet.getRange() + " miles");
				System.out.println("Price: $" + jet.getPrice());
				System.out.println();
			}
		}
	}

	private static void flyAllJets() {
		List<Jet> jetFleet = airField.getAllJets(); // Get the list of all jets from the AirField

		if (jetFleet.isEmpty()) {
			System.out.println("The fleet is empty.");
		} else {
			System.out.println("Flying all jets...\n");
			for (Jet jet : jetFleet) {
				jet.fly(); // Call the fly() method for each jet
				System.out.println(); // Add a blank line for separation
			}
		}
	}

	private static void viewFastestJet() {
		Jet fastestJet = airField.findFastestJet(); // Call a method to find the fastest jet

		if (fastestJet != null) {
			System.out.println("Fastest Jet:");
			System.out.println("Model: " + fastestJet.getModel());
			System.out.println("Speed: " + fastestJet.getSpeed() + " MPH");
			System.out.println("Range: " + fastestJet.getRange() + " miles");
			System.out.println("Price: $" + fastestJet.getPrice());
		} else {
			System.out.println("There are no jets in the fleet.");
		}
	}

	private static void viewLongestRangeJet() {
		Jet longestRangeJet = airField.findLongestRangeJet(); // Call a method to find the jet with the longest range

		if (longestRangeJet != null) {
			System.out.println("Jet with Longest Range:");
			System.out.println("Model: " + longestRangeJet.getModel());
			System.out.println("Speed: " + longestRangeJet.getSpeed() + " MPH");
			System.out.println("Range: " + longestRangeJet.getRange() + " miles");
			System.out.println("Price: $" + longestRangeJet.getPrice());
		} else {
			System.out.println("There are no jets in the fleet.");
		}
	}

	private static void loadAllCargoJets() {
		List<Jet> jetFleet = airField.getAllJets(); // Get the list of all jets from the AirField

		boolean cargoLoaded = false; // Flag to track if any cargo jet was loaded

		for (Jet jet : jetFleet) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
				cargoLoaded = true; // Set the flag to true if at least one cargo jet is loaded
			}
		}

		if (cargoLoaded) {
			System.out.println("Cargo loaded in all Cargo Jets.");
		} else {
			System.out.println("There are no Cargo Jets in the fleet.");
		}
	}

	private static void dogfight() {
		List<Jet> jetFleet = airField.getAllJets(); // Get the list of all jets from the AirField

		boolean fighterJetsFound = false; // Flag to track if any fighter jets are found

		for (Jet jet : jetFleet) {
			if (jet instanceof CombatReady) {
				((CombatReady) jet).fight();
				fighterJetsFound = true; // Set the flag to true if at least one fighter jet is found
			}
		}

		if (fighterJetsFound) {
			System.out.println("Dogfight initiated for Fighter Jets.");
		} else {
			System.out.println("There are no Fighter Jets in the fleet.");
		}
	}

	private static void addJetToFleet() {
		Scanner input = new Scanner(System.in);

		System.out.println("Select the type of jet to add:");
		System.out.println("1. Passenger Jet");
		System.out.println("2. Cargo Jet");
		System.out.println("3. Fighter Jet");
		int jetTypeChoice = input.nextInt();

		System.out.print("Enter the model: ");
		String model = input.next();

		System.out.print("Enter the speed (in MPH): ");
		double speed = input.nextDouble();

		System.out.print("Enter the range (in miles): ");
		int range = input.nextInt();

		System.out.print("Enter the price: $");
		double price = input.nextDouble();

		Jet newJet = null;

		switch (jetTypeChoice) {
		case 1:
			System.out.print("Enter the cargo capacity (in tons): ");
			int passengerCapacity = input.nextInt();
			newJet = new PassengerJet(model, speed, range, price, passengerCapacity);
			break;
		case 2:
			System.out.print("Enter the cargo capacity (in tons): ");
			double cargoCapacity = input.nextDouble();
			newJet = new CargoJet(model, speed, range, price, cargoCapacity);
			break;
		case 3:
			System.out.print("Enter the missile count: ");
			int missileCount = input.nextInt();
			newJet = new FighterJet(model, speed, range, price, missileCount);
			break;
		default:
			System.out.println("Invalid choice.");
			input.close();

			return;

		}
		input.close();

		airField.addJet(newJet);
		System.out.println("Jet added to the fleet.");
	}

	private static void removeJetFromFleet() {
		Scanner input = new Scanner(System.in);

		List<Jet> jetFleet = airField.getAllJets(); // Get the list of all jets from the AirField

		if (jetFleet.isEmpty()) {
			System.out.println("The fleet is empty. No jets to remove.");
			input.close();
			return;
		}

		// Display the list of jets with numbers for selection
		System.out.println("Select a jet to remove by entering its number:");
		for (int i = 0; i < jetFleet.size(); i++) {
			Jet jet = jetFleet.get(i);
			System.out.println((i + 1) + ". " + jet.getModel());
		}

		int jetToRemove = input.nextInt();

		if (jetToRemove >= 1 && jetToRemove <= jetFleet.size()) {
			Jet removedJet = jetFleet.remove(jetToRemove - 1); // Remove the selected jet
			System.out.println("Removed jet: " + removedJet.getModel());
		} else {
			System.out.println("Invalid selection. No jet removed.");
		}
		input.close();
	}
}
