package org.polymorph;

public class OverRidingDemo2 extends OverridingDemo{
	
	
	@Override
	public void deposit(int n) {
		System.out.println("updated deposit \t:"+n);
		super.deposit(n);
	}
	public static void main(String[] args) {
		OverRidingDemo2 od2 =new OverRidingDemo2();
		od2.deposit(5);
		
		
		od2.saving(0);
		od2.fixed(8);
		
	}

}
