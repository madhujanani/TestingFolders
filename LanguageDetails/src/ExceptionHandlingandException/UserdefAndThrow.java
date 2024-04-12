package ExceptionHandlingandException;

import java.util.Scanner;

public class UserdefAndThrow {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Age : ");
		int nextInt = s.nextInt();
		if (nextInt>=18) {
			System.out.println(" you are eligible to vote ");			
		} 
		else {
			try {
				throw new AgeException();
			}			
			catch (AgeException e) {
				System.out.println(" catched it ");
				//printstacktrace will print the execption------here Age Exception
			e.printStackTrace();
			
			}		
		}
	}
}
	
	


