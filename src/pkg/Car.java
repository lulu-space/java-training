package pkg;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super();
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

    public void displayInfo() {
        System.out.println("Doors: " + numberOfDoors);
    }
}
