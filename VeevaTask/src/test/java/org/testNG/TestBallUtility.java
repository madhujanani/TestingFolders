package org.testNG;


import org.model.Ball;
import org.utility.BallUtility;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestBallUtility {
	
	@Test
	public void testGetHeaviestWithNull(){
		System.out.println("Running test : testGetHeaviestWithNull");
		Ball expected = new Ball();
		Ball actual =  BallUtility.getHeaviest(null);
		Assert.assertEquals(expected.getWeight(), actual.getWeight());
		Assert.assertEquals(expected.getPosition(), actual.getPosition());
		Assert.assertEquals(expected.getIndex(), actual.getIndex());
	}

	@Test
	public void testGetHeaviestWithEmptyArray(){
		System.out.println("Running Test : testGetHeaviestWithEmptyArray");
		float array[]= {};
		Ball expected = new Ball();
		Ball actual =  BallUtility.getHeaviest(array);
		Assert.assertEquals(expected.getWeight(), actual.getWeight());
		Assert.assertEquals(expected.getPosition(), actual.getPosition());
		Assert.assertEquals(expected.getIndex(), actual.getIndex());
	}
	
	@Test
	public void testGetHeaviestWithOneWeight(){
		System.out.println("Running test : testGetHeaviestWithOneWeight");
		float array[]= {1};
		Ball expected = new Ball();
		expected.setWeight(1);
		expected.setPosition(1);
		expected.setIndex(0);
		Ball actual =  BallUtility.getHeaviest(array);
		Assert.assertEquals(expected.getWeight(), actual.getWeight());
		Assert.assertEquals(expected.getPosition(), actual.getPosition());
		Assert.assertEquals(expected.getIndex(), actual.getIndex());
	}
		
	@Test
	public void testGetHeaviestWithTwoWeight(){
		System.out.println("Running Test : testGetHeaviestWithTwoWeight");
		float array[]= {2,1};
		Ball expected = new Ball();
		expected.setWeight(2);
		expected.setPosition(1);
		expected.setIndex(0);
		Ball actual =  BallUtility.getHeaviest(array);
		System.out.println("Actual :"+actual.getPosition());
		System.out.println("Actual Weight :" +actual.getWeight());
		System.out.println("Actua Index :" +actual.getIndex());
		Assert.assertEquals(expected.getWeight(), actual.getWeight());
		Assert.assertEquals(expected.getPosition(), actual.getPosition());
		Assert.assertEquals(expected.getIndex(), actual.getIndex());
	}
	@Test
	public void testGetHeaviestWithMultipleWeight(){
		System.out.println("Running test : testGetHeaviestWithMultipleWeight");
		float array[]= {4,4,4,4,4,4,23,4,4,4,4};
		Ball expected = new Ball();
		expected.setWeight(23);
		expected.setPosition(7);
		expected.setIndex(6);
		Ball actual =  BallUtility.getHeaviest(array);
		Assert.assertEquals(expected.getWeight(), actual.getWeight());
		Assert.assertEquals(expected.getPosition(), actual.getPosition());
		Assert.assertEquals(expected.getIndex(), actual.getIndex());
	}
	
	@Test
	public void testGetHeaviestWithoneTwoWeight(){
		System.out.println("Running Test : testGetHeaviestWithTwoWeight");
		float array[]= {1,2};
		Ball expected = new Ball();
		expected.setWeight(2);
		expected.setPosition(2);
		expected.setIndex(1);
		Ball actual =  BallUtility.getHeaviest(array);
		System.out.println("Actual :"+actual.getPosition());
		System.out.println("Actual Weight :" +actual.getWeight());
		System.out.println("Actua Index :" +actual.getIndex());
		Assert.assertEquals(expected.getWeight(), actual.getWeight());
		Assert.assertEquals(expected.getPosition(), actual.getPosition());
		Assert.assertEquals(expected.getIndex(), actual.getIndex());
	}
}
	
