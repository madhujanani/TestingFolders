package org.model;

public class Ball {
    private float weight;
    private int position;
	private int index;
	
	public Ball() {	}
	
	public Ball(float weight,int index,int position) {
		this.weight = weight;
		this.index = index;
		this.position = position;	
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public int getPosition() {
		return position;
	}
	
	public int getIndex() {
		return index;
	}
	
}
