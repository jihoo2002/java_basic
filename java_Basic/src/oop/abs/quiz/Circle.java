package oop.abs.quiz;

public class Circle extends shape{

private double radius;

	
public Circle(String name,double radius) {
	super(name);
	this.radius = radius;
	
}

	@Override
	public double getArea() { //강제 오버라이딩
	
		return Math.PI * radius * radius;
	}
	
	public double getRadius(int radius) {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
