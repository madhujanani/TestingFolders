package org.abstraction;

public class PartialAbstraction2 extends PartialAbstaction1 {

	@Override
	public void ug(int num) {
		System.out.println("Number of pg Courses Avaliable:"+num);
		System.out.println("updated UG");
		
		
	}

	@Override
	public void pg(int num) {
		System.out.println("Number of pg Courses Avaliable:"+num);
		System.out.println("Updated Pg");
		
	}
	public static void main(String[] args) {
		PartialAbstraction2 pa2 = new PartialAbstraction2();
		pa2.pg(19);
		pa2.ug(38);
		pa2.masters();
		
	}

}
