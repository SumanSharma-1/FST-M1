package hello;

public class Activity1 {
	
	public static void main(String[] args) {
	
	Car swift= new Car();
	swift.make=2014;
	swift.color="Black";
	swift.transmission="Manual";
	
	swift.displayChracteristic();
	swift.accelerate(50);
	swift.brake();
	

}
}
