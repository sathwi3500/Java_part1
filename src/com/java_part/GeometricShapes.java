/*
 * Assignment 5: Shape Hierarchy
Create a hierarchy of classes representing geometric shapes. 
Start with a base class Shape and derive classes like Circle, Rectangle, and Triangle. 
Each derived class should have methods to calculate area and perimeter. 
Demonstrate polymorphism by creating  Shape objects and invoking area/perimeter methods.
 */

package com.java_part;

class Shape
{
	void calculateArea()
	{
		System.out.println("Area");
	}
	void calculatePerimeter()
	{
		System.out.println("Perimetere");
	}
	
}
class Circle extends Shape
{
	float radius;

	public Circle(float radius) {
		this.radius = radius;
	}
	void calculateArea()
	{
		double area=3.14*radius*radius;
		System.out.println("Area of circle: "+area);
	}
	void calculatePerimeter()
	{
		double perimeter=2*3.14*radius;
		System.out.println("Perimetere of Circle: "+perimeter);
	}
	
}
class Rectangle extends Shape
{
	float leanth;
	float breadth;
	public Rectangle(float leanth, float breadth) {
		this.leanth = leanth;
		this.breadth = breadth;
	}
	
	void calculateArea()
	{
		
		System.out.println("Area of Rectangle: "+leanth*breadth);
	}
	void calculatePerimeter()
	{
		System.out.println("Perimetere of Rectangle: "+2*(leanth+breadth));
	}
	
	
}
class Triangle extends Shape
{
	float base;
	float height;
	public Triangle(float base, float height) {
		this.base = base;
		this.height = height;
	}
	void calculateArea()
	{
		double area=0.5 *base*height;
		System.out.println("Area of right angle triangle: "+area);
	}
	void calculatePerimeter()
	{
		double perimeter=base+height+Math.sqrt(base*base+height*height);
		System.out.println("Perimetere of right angle triangle: "+perimeter);
	}
	
}

public class GeometricShapes {

	public static void main(String[] args) {
		Shape circle=new Circle(7);
		circle.calculateArea();
		circle.calculatePerimeter();
		Shape rect=new Rectangle(25,25);
		rect.calculateArea();
		rect.calculatePerimeter();
		Shape tri=new Triangle(3,4);
		tri.calculateArea();
		tri.calculatePerimeter();

	}

}
