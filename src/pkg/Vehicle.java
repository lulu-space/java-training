package pkg;

public class Vehicle {
	private String brand;
	private int year;
	
	public Vehicle(String brand, int year) {
		this.brand=brand;
		this.year=year;
	}
	
	public void SetBrand(String brand) {
		this.brand=brand;
	}
	
	public String GetBrand() {
		return brand;
	}
	
	public void SetYear(int year) {
		this.year=year;
	}
	
	public int GetYear() {
		return year;
	}
}

