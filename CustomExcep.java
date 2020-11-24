package SelfLearning;

public class CustomExcep {
	
		
		public static void valid(int age) throws UserException {
			
			System.out.println("Hello Hi");
			
			if(age<18) 
			throw new UserException("Invalid Age");
			
			else
				System.out.println("Welcome to vote");
		
	}
		
		public static void main(String[] args) {
			
			try {
				
				valid(15);
				
			}catch(Exception m) {
				System.out.println("Exeption Occured " + m);
				
			}
		}

}
