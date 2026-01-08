package pkg;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        setNumberOfDoors(numberOfDoors);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be positive.");
        }
        this.numberOfDoors = numberOfDoors;
    }

    // Overriding displayInfo to include doors
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numberOfDoors);
    }
}
Java

Copy code
// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get user input
            System.out.print("Enter car make: ");
            String make = scanner.nextLine();

            System.out.print("Enter car model: ");
            String model = scanner.nextLine();

            System.out.print("Enter car year: ");
            int year = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter number of doors: ");
            int doors = Integer.parseInt(scanner.nextLine());

            // Create Car object
            Car myCar = new Car(make, model, year, doors);

            // Display details
            System.out.println("\nCar Details:");
            myCar.displayInfo();

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter numeric values for year and doors.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
