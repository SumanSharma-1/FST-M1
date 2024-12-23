package session3;

public class Activity12 {

	public static void main(String[] args) {
		Addable ad1= (int num1, int num2)->(num1+num2);
		Addable ad2= (int num1, int num2)->{
			return (num1+num2);
		};
		
		System.out.println("Sum from empty lambda: "+ad1.add(20, 50));
		System.out.println("Sum from body lambda: "+ad2.add(40, 90));

	}

}
