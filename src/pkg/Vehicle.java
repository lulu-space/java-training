package pkg;

public class Vehicle {
	
	public String brand;
	private int year;
	protected int id;
	
	public Vehicle() {
		 this.brand="unknown";
		 this.year=0;
		 this.id=0;
	}
	
	public Vehicle(String brand, int year, int id) {
		this.brand=brand;
		this.year=year;
		this.id=id;
	}
	
	public void SetYear(int year) {
	    if (year > 0) this.year = year;
	    else {
	    	this.year=0;
	    }
	}
	
	public int GetYear() {
		return year;
	}
	
    @Override
    public String toString() {
        return "Vehicle [brand=" + brand + ", year=" + year + ", id=" + id + "]";
    }
	
}

