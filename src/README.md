1. **Define the Base Classes and Interfaces**
    - **Jet Class**: This will be an abstract class with attributes like `model`, `speed`, `range`, and `price`. It will also contain the abstract method `fly()`.
    - **Interfaces for Specialized Behavior**: Define two interfaces for specialized jets. For example, `CargoCarrier` with a `loadCargo()` method and `CombatReady` with a `fight()` method.

2. **Implement Concrete Classes**
    - **PassengerJet Class**: A concrete class extending `Jet`.
    - **Two Specialized Jet Classes**: Each should extend `Jet` and implement one of the interfaces. For example, a `CargoJet` implementing `CargoCarrier` and a `FighterJet` implementing `CombatReady`.

3. **Develop the Application Structure**
    - **JetsApplication Class**: This is your main class with the `main` method to launch the program.
    - **AirField Class**: This class represents an airfield and should contain a list of jets.

4. **Initialize the Fleet**
    - On startup, populate the `AirField` with a mix of jet instances (e.g., 2 Cargo Jets, 2 Fighter Jets, and 1 Passenger Jet).

5. **Implement the Menu System**
    - Create a menu with options to list the fleet, fly all jets, view the fastest jet and jet with the longest range, specific actions for specialized jets (like loading cargo or engaging in a dogfight), add or remove a jet, and quit the program.

6. **Implement Functionality for Each Menu Option**
    - **Listing Fleet**: Display details of each jet in the fleet.
    - **Flying Jets**: Invoke the `fly()` method on each jet.
    - **Viewing Fastest/Longest Range Jet**: Search the collection to find and display these jets.
    - **Special Actions**: Implement the interface methods for specialized jets.
    - **Adding/Removing Jets**: Allow users to add a new jet or remove an existing one from the fleet.

7. **Stretch Goals (Optional)**
    - Implement additional features like flying individual jets, assigning pilots to jets, hiring new pilots, and displaying pilot information with jet details.

8. **Finalize and Document**
    - Ensure your code adheres to the grading criteria.
    - Document your code and create a README file explaining your program, the technologies used, and how to run it.

9. **Testing and Debugging**
    - Thoroughly test each part of your application to ensure it works as expected and debug any issues.
