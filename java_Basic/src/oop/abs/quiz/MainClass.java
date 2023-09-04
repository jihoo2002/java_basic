package oop.abs.quiz;

public class MainClass {

	public static void main(String[] args) {
		
		Circle cir = new Circle("원",4.0 );
		Rect sp = new Rect("정사각형", 5);
		Rect sp1 = new Rect("직사각형", 5,6);
		
		
		System.out.println(sp.getName() +sp.getArea());
		System.out.println( "원: " + cir.getArea());
		System.out.println("직사각형: " +sp1.getArea());
	}

}