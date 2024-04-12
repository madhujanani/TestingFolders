package org.string;

public class StringAdvance {
	public static void main(String[] args) {
		/* All index of a particular character */
		
		String S1 = "Greens Technology institute@12345";
		System.out.println("Index of lettter 'e' :");
		for (int i = S1.indexOf('e'); i < S1.lastIndexOf('e'); i++) {
			char charAt = S1.charAt(i);
			if (charAt=='e') {
				System.out.println(i);
				
			}
		}
//		/* counting upper and lower case in a string*/
		int Upper=0,lower=0,number=0;
		for (int i = 0; i < S1.length(); i++) {
			char charAt = S1.charAt(i);
			if (charAt>'A' &&  charAt<'Z' ) {
				Upper++;
			}
		if (charAt>'0' && charAt<'9') {
			number++;
			
		}
			else {
				lower++;
			}
		}
		System.out.println("upper  "+Upper);
		System.out.println("Lower  "+lower);
		System.out.println("Number  "+number);
//
//		/* inbuild method to print upper and lower case*/
		String replaceAll = S1.replaceAll("[A-Z]", "");
		replaceAll.codePointCount(Upper, lower);
		System.out.println("Only lower case :"+replaceAll);
		/* use ^ symbol if you want that:here i want only capital so i used ^ this*/ 
		String repll = S1.replaceAll("[^A-Z]", "");
		System.out.println("Only upper case :"+repll);
		String num = S1.replaceAll("[^0-9]", "");
		System.out.println("Only number to ptint :"+num);
		String num1 = S1.replaceAll("[0-9]", "");
		System.out.println("Only number  not to ptint :"+num1);
		String num2 = S1.replaceAll("\\d", "");
		System.out.println("Only number  not to ptint :"+num2);
		
		/* To find vowels and cosonannts */
		String S2 = "Greens Technology institute@12345";
		int vowel=0,cons=0;		
		for (int i = 0; i < S2.length(); i++) {
		char ch = S2.charAt(i);		
		if (ch =='A' || ch=='E'||ch =='I' || ch=='O'||ch =='U' || 
				ch=='a'||ch =='e' || ch=='i'||ch =='o' || ch=='u')
		 {			
			vowel++;
		 }			
		else {
			cons++;
		}		
	}
		System.out.println(" vowels :  "  +vowel);
		System.out.println(" Consonants : "+cons);	
	
	/* inbuild method to replace  */
		String re2 = S2.replaceAll("[AEIOUaeiou]","*");
		System.out.println("String S2 is : "+re2);
	
	
	
	
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
