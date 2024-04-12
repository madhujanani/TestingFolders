package org.polymorph;

public class OverloadingDemo {

	
	private void empId() {
		System.out.println("Employee Id :123456");
	}
//	private void empId() {
//		System.out.println("Employee Id :654321");
//
//	}
	private void empId(int id) {
		System.out.println("Emp Id :"+id);

	} private void empId(String name) {
		System.out.println("Emp name :"+name);

	}private void empId4(String name,long ph) {
		System.out.println("name:"+name+"phone"+ph);
	}private void empId5(float n,String s) {
		System.out.println("name:"+n+"phone"+s);

	}
		//private void empId() {
//		System.out.println("Employ check");
//
//	}
	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.empId();
		od.empId(0);
		od.empId("hello");
		od.empId4(null, 076543212345l);
		od.empId5(0, null);
		od.empId();
	}
}
