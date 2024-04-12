package org.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethods {

	/*: Create a HashMap with the below key and values
              key    : 10,20,30,40,50,60,10,50,40
              values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.
              */
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<>();
		mp.put(10, "java");mp.put(20, "sql");mp.put(30, "oops");mp.put(40, "sql");mp.put(50, "oracle");
		mp.put(60, "DB");mp.put(10, "selenium");mp.put(50, "psql");mp.put(40, "hadoop");
		
		System.out.println("To print only the values :"+mp.values());
	
		System.out.println("The map is "+mp);
		System.out.println("==============================");
				
		/*Create a HashMap with the below key and values and get(print) the key only in the map.
              key    : 10,20,30,40,50,60,10,50,40
              values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.
              */
		System.out.println("To print only the keys :"+mp.keySet());
		
		/* Create a HashMap with the below key and values and get(print) the values only in the map.
              key    : 10,20,30,40,50,60,10,50,40
              values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.
              */
		System.out.println("To print only the values :"+mp.values());
		System.out.println("=====================================");
		
		/*Create a HashMap with the below key and values and iterate it using enhanced for loop.
              key    : 10,20,30,40,50,60,10,50,40
              values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.
              */
		Set<Integer> keySet = mp.keySet();
		System.out.println("Print only keys using Enhanced loop");
		for (Integer integer : keySet) {
			System.out.println(integer);
		}
		System.out.println("=================================");
		Collection<String> values = mp.values();
		System.out.println("Print only values using Enhanced loop :");
		for (String string : values) {
			System.out.println(string);	
		}
		
		System.out.println("=========================================");
		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
		System.out.println(entry);
		}
		System.out.println("=========================================");
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("The keys are : "+entry.getKey()+ "\tThe values are :"+entry.getValue());		
		}
		System.out.println("=============================================");
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("The keys are : "+entry.getKey()); 
			System.out.println("The values are :"+entry.getValue());
			System.out.println("\n");
			}
		System.out.println("======================================");
		Set<Entry<Integer, String>> entrySet2 = mp.entrySet();
		for (Entry<Integer, String> entry : entrySet2) {
			if (entry.getValue().equals("selenium")) {
				System.out.println(entry.getKey());
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
