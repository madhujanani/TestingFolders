package ExceptionHandlingandException;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;

public class CompileExption {
	/*If we have compile time error we can resolve using
	throws in method declaration or using trycatch
	*/
	private void asA() throws InterruptedException {
		Thread.sleep(0);
		System.out.println("print meothod A ");
	}
	private void asB() throws AWTException {
		Robot rb = new Robot();
		System.out.println("print meothod B");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		CompileExption ce = new CompileExption();
		ce.asA();
		ce.asB();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

