package org.abstraction;

public class FullyAbstraction2  implements FullyAbstraction1{

	@Override
	public void cost(int rate) {
		System.out.println("Cost of Gas :\t" +rate);
		
	}

	@Override
	public void speed(float km) {
		System.out.println("Speed of vehicle :\t" +km);
		
	}
	private void vehicleName(String name) {
		System.out.println("Vehical name:\t"+name);
		
	}
	public static void main(String[] args) {
		FullyAbstraction2 fa2 = new FullyAbstraction2();
		fa2.cost(67);
		fa2.speed(34.87659f);
		fa2.vehicleName("suburu");
		
	}

}
