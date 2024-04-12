package org.controlstatements;

import java.util.Iterator;
import java.util.Scanner;

public class ConditionDemo {

	/*Description: Write Java program to allow the user to input his/her age.     
             Then the program will show if the person is eligible to vote.
             A person who is eligible to vote must be older than or equal 1 to 18 years old.
             */
	
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter you age:\t");
//		int age = s.nextInt();
//		System.out.println("Enter you name:\t");
//		String name = s.next();
//		
//		if (age >=18 ) {
//		    System.out.println(name+ " is eligible to vote as the age is " +age);
//		} 
//		else {
//			System.out.println(name+ " is  not eligible to vote as the age is " +age);
//		}
//	}
	
	/*Description: Write a program to find even or odd number*/
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a number:");
//		int number = s.nextInt();
//		if ((number%2)==0) {
//			System.out.println("The number " +number+ "is even.");
//			
//		} else {
//			System.out.println("The number " +number+ "is odd.");
//
//		}
	
/* Write a program to print even number from 1 to 100 */
	
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the highesh number to be printed: ");
//		int number = s.nextInt();
//		for (int i = 1; i <=number; i++) {
//			if ((i%2)==0) {
//				System.out.println(i);
//			} 
//		}
//	}
	
/*	Find the sum of odd number 1 to 100  */
//	public static void main(String[] args) {
//	int sum =0;
//	Scanner s = new Scanner(System.in);
//	System.out.println("Enter the highesh number for adding: ");
//	int number = s.nextInt();	
//	for (int i = 1; i <=number; i++) {
//		if ((i%2)!=0) {
//			sum =sum+i;
//		} 
//	}
//	System.out.println(sum);
//
//	}
	
	/* Count of even number 1 to 100  */
	
//	public static void main(String[] args) {
//	int count =0;
//	Scanner s = new Scanner(System.in);
//	System.out.println("Enter the highesh number for counting: ");
//	int number = s.nextInt();
//		for (int i = 1; i <=number; i++) {
//			if ((i%2)==0) {
//				//count+=1;
//				count =count +1;
//			} 
//		}
//		System.out.println(count);
//}
	/*  Write a program to find the factorial of a number */
	
//	public static void main(String[] args) {
//		  int fact =1;
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a number:");
//		int number = s.nextInt();
//		if (number <0) {
//			System.out.println("Enter a positive number ");
//			}		
//			if (number==0) {
//				}
//				else {
//			      for (int i = 1; i <= number; i++) {
//			    	
//					fact =fact*i;
//					if (i ==0) {
//						break;
//					}
//				  }	
//			      	 
//				}System.out.println("The Factorial is :"+fact);					
//			}
	
	/*  Write a program to print the fibonacci series of a number 1 to 100 */
//	public static void main(String[] args) {
//	  int num1 =0, num2=1;
//	Scanner s = new Scanner(System.in);
//	System.out.println("Enter a  highest number to print the series ");
//	int number = s.nextInt();
//	System.out.println("THE SERIES FOR " +number+ " FABANOCCI  SERIES IS BELOW ");
//		for (int i = 1; i <= number; i++) {
//			System.out.print(num1+ " ");
//		 int num3=num2+num1;
//		     num1=num2;
//		     num2=num3;
//		}
//	}	
	
	
	/*  Find prime number or not.*/
	
//	public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.println("Enter a number  ");
//	int number = s.nextInt();
//	for (int i = 2; i <number; i++) {
//		if (number%i==0) {
//			System.out.println(" not prime");
//			break;
//			
//		} else {
//			System.out.println("prime");
//			break;
//	}	
//	}

	/* 1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
-----------------------*/
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a number  ");
//		int number = s.nextInt();
//	for (int i = 1; i <=number; i++) {
//		for (int j = 1; j <i; j++) {
//			System.out.print(j+ " ");
//			
//		}System.out.println();
//		
//	}
//	}
	
	/*
	 
	 	 *
        *  *
       *  *  *
     *  *  *  *
   *   *  *  *  * 
	 
	  */
	
//	public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.println("Enter a number  ");
//	int number = s.nextInt();
//for (int i = 1; i <=number; i++) {
//	for (int j = 1; j <i; j++) {
//		System.out.print("*"+ " ");
//		
//	}System.out.println();
//	
//}
//}
	/* count the numbers*/
//	public static void main(String[] args) {
//	int count =0;
//	Scanner s = new Scanner(System.in);
//	System.out.println("Enter a number  ");
//	String number = s.nextLine();
//	
//	for (int i = 0; i < number.length(); i++) {
//		count +=1;
//	}		
//	System.out.println("The count is " +count);		
//
//	}
//	
	
	/* sum of the numbers*/
//	public static void main(String[] args) {
//	int sum=0;
//	Scanner s = new Scanner(System.in);
//	System.out.println("Enter a number  ");
//	int number = s.nextInt();
//	for (int i = 0; i < number;i++) {
//		if (number!=0) {
//			sum+=number%10;
//			number=number/10;			
//		}			
//	}
//	System.out.println("The sum is " +sum);	
//	}
//	
	
	/* reverse of a number or a string*/
//	public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.println("Enter a number or a string  ");
//		String S1 = s.next();
//		 System.out.println("Reverse  of the string ");
//		for (int i = S1.length()-1; i>=0; i--) {
//			 System.out.print(S1.charAt(i));
//		}
//		System.out.println("\n");
//		System.out.println("Reverse using string builder");
//		StringBuilder sb = new StringBuilder("GreensTechnology");
//			StringBuilder reverse = sb.reverse();
//			System.out.println(reverse);
	/* we have inbuid method for reversing in String builder and buffer
	 * but not in String clas so used logic	
	 */

			
	 /* sum of digits in num*/
	
	public static void main(String[] args) {
		int rem=0, res=0;
		Scanner dig = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = dig.nextInt();
		while (num>0) {
			 rem =num%10;
			 res=res+rem;
			 num=num/10;			
		}
		System.out.println(res);
	
			
			
	}	

	/* palandrome
	 * Amstrong
	 
	 * 
	 */

	
}	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
