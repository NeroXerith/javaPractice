package javaPractice;

public class Vehicle {
	private String brand = "";
	private String modelName ="";
	private int yearModel;
	private int maxSpeed;
	
	public Vehicle(String brand) {
		this.brand = brand;
	}
	
	public String getBrand(){
		return this.brand;
	}
	
	private void setBrand() {
		this.brand = brand;
	}
}
