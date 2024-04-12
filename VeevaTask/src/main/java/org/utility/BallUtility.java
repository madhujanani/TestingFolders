package org.utility;

import java.util.Iterator;

import org.model.Ball;

//There are N number of balls, all of equal weight except for one which is heavier than the rest.
//Write a program in Java that accepts the weights as an Array and identifies the heaviest ball in the Array.
//NOTE: Do NOT use Java utility methods to find the max element
//NOTE: Create the logic in a way that it can find the heaviest ball from a Large Array
//Print out the position of the element and the weight
//Write test cases for testing this program (TestNG tests would be better)
//Please create it as a gradle project (do it Maven/gradle any build tool)
public class BallUtility {
	
	public static Ball  getHeaviest(float []ballWeight) {
	    Ball b = new Ball();
	    if (ballWeight == null) {
	    	return b;
		}
    	int size= ballWeight.length;

		switch(size) {
		   case 0 :
		      return b; 
		   
		   case 1 :
			  return new Ball(ballWeight[0],0,1);
			  
		   case 2:
				return ballWeight[0] < ballWeight[1] ? new Ball(ballWeight[1], 1, 2) :
					new Ball(ballWeight[0], 0, 1);
		}
		
		float max = ballWeight[0];
		for (int i = 0; i < ballWeight.length; i++) {
			if (max < ballWeight[i]) {
				b.setWeight(ballWeight[i]);
				b.setIndex(i);
				b.setPosition(i+1);
			}
		}
		return b;
	}
}	
