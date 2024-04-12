package org.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Setprogram {

	public static void main(String[] args) {
		/* Create a HashSet for the below values
              Input : List = 10,20,30,40,50,60,70,80,90,10,20
              */
		Set<Integer> hs = new HashSet<>();
		hs.add(10);hs.add(20);hs.add(30);hs.add(40);hs.add(50);
		hs.add(60);hs.add(70);hs.add(80);hs.add(90);hs.add(10);hs.add(20);
		System.out.println(hs);
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(10);lhs.add(20);lhs.add(30);lhs.add(40);lhs.add(50);
		lhs.add(60);lhs.add(70);lhs.add(80);lhs.add(90);lhs.add(10);lhs.add(20);
		System.out.println(lhs);
		Set<Integer> ts = new TreeSet<>();
		ts.add(10);ts.add(20);ts.add(30);ts.add(40);ts.add(50);
		ts.add(60);ts.add(70);ts.add(80);ts.add(90);ts.add(10);ts.add(20);
		System.out.println(ts);
		System.out.println("=================================");
		
		/*Convert the below list in to set(use addAll()) method
              Input : List = 105,205,305,405,505,605,705,805,505,605
              */
		List< Integer> li = new ArrayList<>();
		li.add(105);li.add(205);li.add(305);li.add(405);li.add(505);
		li.add(605);li.add(705);li.add(805);li.add(505);li.add(605);
		Set<Integer> si = new LinkedHashSet<>(li);
		System.out.println(si);
		System.out.println(li.addAll(si));
		System.out.println("=============================");
		
		/* Create a TreeSet and iterate each value in the set by using enhanced for loop
              Input : List = 10,20,30,40,50,60,70,80,90,10,20
              */
		Set<Integer> ts1 = new TreeSet<>();		
		ts1.add(10);ts1.add(20);ts1.add(30);ts1.add(40);ts1.add(50);
		ts1.add(60);ts1.add(70);ts1.add(80);ts1.add(90);ts1.add(10);ts1.add(20);
		for (Integer v : ts1) {
			System.out.println(v);
		}
			System.out.println("==============================");
			
			/*Create a new LinkedHashSet with values and return the common values
              Input : List = 10,20,30,90,10,10,40,50
              Input : List = 10,20,60,50,40,70,80,90
              */
			Set<Integer> lh1 = new LinkedHashSet<>();
			lh1.add(10);lh1.add(20);lh1.add(30);lh1.add(90);lh1.add(10);
			lh1.add(10);lh1.add(40);lh1.add(50);
						
			Set<Integer> lh2 = new LinkedHashSet<>();
			lh2.add(10);lh2.add(20);lh2.add(60);lh2.add(50);lh2.add(40);
			lh2.add(70);lh2.add(80);lh2.add(90);
			System.out.println(lh2);
			lh2.retainAll(lh1);
			System.out.println(lh2);
	     	System.out.println("===============================");
		/* Create a new LinkedHashSet with values and perform removeAll() function
              Input : List = 10,20,30,90,10,10,40,50
              Input : List = 10,20,60,50,40,70,80,90
              */
	     	Set<Integer> lhs1 = new LinkedHashSet<>();
			lhs1.add(10);lhs1.add(20);lhs1.add(30);lhs1.add(90);lhs1.add(10);
			lhs1.add(10);lhs1.add(40);lhs1.add(50);
						
			Set<Integer> lhs2 = new LinkedHashSet<>();
			lhs2.add(10);lhs2.add(20);lhs2.add(60);lhs2.add(50);lhs2.add(40);
			lhs2.add(70);lhs2.add(80);lhs2.add(90);
			System.out.println(lhs2);
			lhs2.removeAll(lhs1);
			System.out.println(lhs2);
			System.out.println("=====================================");
	     	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
