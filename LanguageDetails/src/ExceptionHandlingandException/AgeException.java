package ExceptionHandlingandException;

public class AgeException extends Exception {
	@Override
	public String getMessage() {
		String s= " Age not avaliable Exception";
		return s;
		
	}

}
