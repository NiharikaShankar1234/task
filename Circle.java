package com.cognizant.shapes;

public class Circle {
	private float radius;
	float pi;
	public Circle (){
		System.out.println(" Default value Inside Constructor1 ");
		//this.radius = radius;
	}
	
	
	public Circle (float radius, float pi){
		System.out.println("Inside Constructor2 ");
		this.setRadius(radius);
		this.pi = pi;
}


	public float getRadius() {
		return radius;
	}


	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float area() {
		float area = (pi*getRadius()*getRadius());
		return area;
	}
	public float circumference() {
		float circum = (2*pi*getRadius());
		return circum;
	}
}