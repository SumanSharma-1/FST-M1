package hello;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		Plane plane=new Plane(10, null);
		plane.onboard("Suman");
		plane.onboard("Ajit");
		plane.onboard("Aarushi");
		plane.onboard("Shaurya");
		
		System.out.println("Plane take off time is: "+plane.takeOff());
		System.out.println("Name of passengers travelling: "+plane.getPassengers());
		Thread.sleep(5000);
		
		plane.land();
		System.out.println("Time of landing: "+plane.getLastTimeLanded());
	}

}
