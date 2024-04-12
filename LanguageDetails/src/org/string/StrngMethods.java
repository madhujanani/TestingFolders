package org.string;

public class StrngMethods {
	
	/*GreensTechnology*/
	public static void main(String[] args) {
		
		String s = "GreensTechnology",s1="",s2= "welcome to java development class";
		String n1="nisha", n2="Nisha", n3="nisha";
		
		String q1 = new String("java");
		String q2 = new String("java");

		System.out.println("String length :"+s.length());

		System.out.println("Index of o:" +s.indexOf('o'));
		System.out.println("Last index of o :"+s.lastIndexOf('o'));

		System.out.println("Last index of empty space :"+s.lastIndexOf("  "));

		System.out.println("Print letter e :"+s.charAt(2));
		System.out.println("contains Te:"+s.contains("Te"));
		System.out.println(" replace method :"+s.replace('G', 'M'));
		System.out.println(" replace method :"+s2.replace("java", " python"));
		System.out.println(" to lower case :"+s.toLowerCase());
		System.out.println("To upper case :"+s.toUpperCase());
		System.out.println("startswith :"+s.startsWith("Gre"));
		System.out.println("endswith :"+s.endsWith("ogy"));
		System.out.println("is empty :"+s1.isEmpty());
		System.out.println("split meothod :"+s2.split(""));		
		System.out.println("split meothod :"+s2.split("to"));
		System.out.println("substring :"+s2.substring(2));
		System.out.println("substring :"+s2.substring(2,19));
		System.out.println("to check equallity :"+n1.equals(n2));
		System.out.println("identity hashcode of n1 :"+System.identityHashCode(n1));
		System.out.println("identity hashcode of n3 :"+System.identityHashCode(n3));
		System.out.println("identity hashcode of q1 :"+System.identityHashCode(q1));
		System.out.println("identity hashcode of q2 :"+System.identityHashCode(q2));




		

		
		
		
		
		
		
		
		
		
		
		
	}

}
