package hello;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car() {
		tyres= 4;
		doors= 4;
	}
	
	public void displayChracteristic() {
		System.out.println("Car color is: " +this.color);
		System.out.println("Car was made in: " +this.make);
		System.out.println("Car has " + this.tyres + " tyres");
		System.out.println("Car has " + this.doors + " doors");
		System.out.println("This car is " + this.transmission);
		
	}
	
	public void accelerate(int speed) {
	speed= speed+5;
	System.out.println("Car is moving with speed: "+speed+ " km/h");
	}

	public void brake() {
	System.out.println("Car has stopped");
	}
}
