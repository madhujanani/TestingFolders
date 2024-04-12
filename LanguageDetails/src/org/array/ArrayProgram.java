package org.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayProgram {
	
	public static void main(String[] args) {
//		/* Write a Java program to sum values of an array
//        Input a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//        Output   = 55
//        */
//		float sum =0;
//		int a[] = {1,2,3,4,5,6,7,8,9,10};
//		for (int i = 0; i < a.length; i++) {
//			sum=sum+a[i];			
//		}
//		System.out.println(" Th sum is :"+sum);
//		System.out.println(" The Average is :"+sum/2);
//		System.out.println("================================");
//		/*  Create a new ArrayListlist with values and find the length of it
//              Input : List = 10,20,30,90,10,10,40,50
//              */
//	
//		List< Object> li = new ArrayList<>();
//		li.add(10);		li.add(20);
//		li.add(30);
//		li.add(90);
//		li.add(10);
//		li.add(10);		li.add(40);
//		li.add(50);
//		System.out.println("Element in list  :"+li);
//		System.out.println("Size of list : "+li.size());
//		System.out.println("==================================");
//		/*Get the each index value of 10 present in below list 
//              Input:   List = 10,20,30,90,10,10,40,50,10
//              */
//		List< Integer> li1 = new ArrayList<>();
//		li1.add(10);		li1.add(20);
//		li1.add(30);
//		li1.add(90);
//		li1.add(10);
//		li1.add(10);		li1.add(40);
//		li1.add(50);
//		
//		System.out.println("Element in list  :"+li1);
//		System.out.println("Size of list : "+li1.size());
//		for (int i = li1.indexOf(10); i <= li1.lastIndexOf(10); i++) {
//			Integer integer = li1.get(i);
//			if (integer== 10) {
//				System.out.println("Index of 10 :"+i);				
//			}			
//		}	
//		System.out.println("Element at position 3 :"+li1.get(2));
//		System.out.println("index of 30 :"+li1.indexOf(30));
//		
//		/* Get the each value of list by using normal for loop
//              Input:   List = 105,205,305,405,505,605,705,805
//              */
//		List<Integer> aj = new ArrayList<Integer>();
//		aj.add(105);aj.add(205);aj.add(305);aj.add(305);
//		aj.add(405);aj.add(505);aj.add(305);aj.add(605);aj.add(305);
//		aj.add(705);aj.add(805);
//		System.out.println("Normal loop");
//		for (int i = 0; i < aj.size(); i++) {
//			Integer nloop = aj.get(i);
//			System.out.println(nloop);
//		}
//		System.out.println("Enhanced loop");
//
//	for (Integer kj : aj) {
//		System.out.println(kj);
//			}
//		System.out.println("remove 305 at index 3 :"+aj.remove(3));
//		aj.add(6, 5555);
//		aj.set(4, 4444);
//		System.out.println("After adding in particular index :");
//		System.out.println(aj);
//		/*replace 305 to 300*/
//		
//		for (int i = 0; i < aj.size()-1; i++) {
//			Integer eqi = aj.get(i);
//			if (eqi == 305) {
//			aj.set(i, 300);
//			}
//		}
//		System.out.println("updated list :"+aj);
//		System.out.println("=================================");
//		/*Input : List = 10,20,30,90,10,10,40,50
//	    Input : List = 10,20,60,50,40,70,80,90
//	    print common values in the list
//	     */
//		List< Integer> r1 = new ArrayList<Integer>(); 
//		r1.add(10);r1.add(20);r1.add(30);r1.add(90);r1.add(10);
//		r1.add(10);r1.add(40);r1.add(50);
//		
//		List< Integer> r2 = new ArrayList<Integer>(); 
//		r2.add(10);r2.add(20);r2.add(60);r2.add(50);r2.add(40);
//		r2.add(70);r2.add(80);r2.add(90);
//		System.out.println(r1);
//		System.out.println(r2);
//		r1.retainAll(r2);
//		System.out.println(r1);
//		/* List = 10,20,30,90,10,10,40,50
//              Input : List = 30,40,50,60,80
//              perform removeall();
//              */
//		List< Integer> r3 = new ArrayList<Integer>(); 
//		r3.add(30);r3.add(40);r3.add(50);r3.add(60);r3.add(80);
//		System.out.println(r3);
//		r1.removeAll(r3);
//		System.out.println(r1);
//		System.out.println("==============================");

		/*Write a Java program to remove duplicates from array
        Input  a[]= {10,10,20,50,60,80,60,50}
        Output a[]= {10,20,50,60,80}*/
		Integer arr[] = {10,10,20,50,60,80,60,50};
		List<Integer> asList = Arrays.asList(arr);
		Set<Integer> si = new LinkedHashSet<>(asList);
		System.out.println(si);
		System.out.println("===========================");
		
		int are[]= {10,10,20,50,60,80,60,50};
		Set< Integer> see = new LinkedHashSet<>();
		for (Integer inte : are) {
			see.add(inte);
		}
		System.out.println(see);
		System.out.println("==================================");
		
		Integer artolst[]= {10,10,20,50,60,80,60,50};
		List<Integer> l1 = Arrays.asList(artolst);
		List<Integer> l2 =new LinkedList<>();
		for (Integer v : l1) {
			if (!l2.contains(v)) {
				l2.add(v);				
			}			
		}System.out.println(l2);
	
	}
	}



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	