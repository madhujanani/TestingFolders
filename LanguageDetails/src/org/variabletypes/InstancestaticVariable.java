package org.variabletypes;

public class InstancestaticVariable {
	//no need to give int  everytime as we are using same variable a here.
	int a =100;
	String str = "programming";
	static int num= 5000;
	private void number1() {
		a=10;
		str ="number1 method";
		num = 4000;
		System.out.println("meothod 1: "+a+" "+str+"  "+num);
		System.out.println("=============================");
		
	}
	private void number2() {
		a=20;
		str ="number1 method";
		num = 3000;
		System.out.println("meothod 2: "+a+" "+str+"  "+num);
		System.out.println("=============================");	
		}
	private void number3() {
		a=30;
		str ="number1 method";
		num = 2000;
		System.out.println("meothod 3: "+a+" "+str+"  "+num);
		System.out.println("=============================");	
		}
	public static void main(String[] args) {
		//no need to create object for static variable
		System.out.println("static value :"+num);
		
		InstancestaticVariable isv =new InstancestaticVariable();
		
		System.out.println("instance variable  "+isv.a+" "+isv.str+" "+num);
		isv.number1();
		System.out.println("instance variable  "+isv.a+" "+isv.str+" "+num);
		isv.number2();
		System.out.println("instance variable  "+isv.a+" "+isv.str+" "+num);
		isv.number3();
		System.out.println("instance variable  "+isv.a+" "+isv.str+" "+num);
		System.out.println("=============================================");
		// new object means it will start again-instsance
		//new object means no use it will take the updated value and not start again -statis 
		InstancestaticVariable is =new InstancestaticVariable();
		System.out.println("instance with new object "+is.a);
		System.out.println("Static variable with new object :"+is.num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
