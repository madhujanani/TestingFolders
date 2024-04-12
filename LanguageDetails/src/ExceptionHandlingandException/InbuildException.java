package ExceptionHandlingandException;

public class InbuildException {
	static int a =100;
	public static void main(String[] args) {
		if (a==10) {
			System.out.println("Equallllllll...........");
			
		} else {
			//to throw inbuild exception just call that exception.so soln in 1 line.
			throw new NumberFormatException();
		}
	}


}
