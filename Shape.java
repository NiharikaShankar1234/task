package com.cognizant.geometry;

import com.cognizant.shapes.*;
public class Shape {
	public static void main(String[] args) {
		Circle c1 = new Circle(1.5f,3.5f );
		Area a1 = new Area(1.5f);
		c1.area();
		System.out.println("Area of Circle "+c1.area());
		c1.circumference();
		System.out.println("Circumference Of Circle "+ c1.circumference());
}
}