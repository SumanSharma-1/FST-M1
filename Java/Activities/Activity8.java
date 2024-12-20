package session2;

public class Activity8 {

	public static void main(String[] args) {
		try{
			Activity8.exceptionTest("Hi I am not null");
			Activity8.exceptionTest(null);
			} catch(CustomException e){
				System.out.println(e.getMessage());
			}

	}
	
	public static void exceptionTest(String message) throws CustomException {
		if(message==null) {
			throw new CustomException("This is custom message");
		}
		else {
			System.out.println(message);
		}
	}

}
