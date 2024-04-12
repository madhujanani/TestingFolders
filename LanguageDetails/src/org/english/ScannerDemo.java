package org.english;

import java.util.Scanner;

public class ScannerDemo {
	/*
     Using Scanner class get the below details
             studentId
             studentName
             Mark1
             Mark2
             Mark3
             Mark4
             Mark5
           :Find the total and average of marks
	 
	 */
		public static void main(String[] args) {
			
			float sum =0;
			Scanner s = new Scanner(System.in);
		System.out.println("Enter student id:\t" );
		int nextInt = s.nextInt();
		
		System.out.println("number of marks");
		int markNumber = s.nextInt();
		
		System.out.println("Enter student name:\t");
		String nextLine = s.next();
		System.out.println("Enter mark :\t");
		for (int i = 0; i < markNumber; i++) {
			float mark1 = s.nextFloat();
			sum =sum+mark1;		
		}
		System.out.println("mark:\t" +sum);
		float avg =sum/markNumber;
		System.out.println("avg:\t" +avg);
	

	
		System.out.println("ID:" +nextInt);
		System.out.println("Name :"+nextLine);
		
			}
		
	}
		
		

	

	
