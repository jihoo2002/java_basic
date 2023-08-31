package oop.poly.car;

public class MainClass {

	public static void main(String[] args) {
		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Porsche p1 = new Porsche();
		Porsche p2 = new Porsche();
		Porsche p3 = new Porsche();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
		//다형성을 적용해서 이종모음 배열을 선언할 수 있다.
		Car[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4};
		//부모 타입 객체에 자식들의 객체 변수가 들어올 수 있다. 
		for(Car c:cars) {
			c.run();
		}
		
		System.out.println("==================");
		
		System.out.println("***타이어 교체 작업!***");
		t1.frontLeft = new HTire(); //커서 두고 alt +shift + r 
		t1.frontRight = new HTire(); //HTire이든, NTire이든 상관없이 사용 가능
		t1.rearLeft = new NTire(); //멤버변수(필드)의 다형성
		t1.rearRight = new NTire();
		
		System.out.println("==================");
		
		Driver kim = new Driver();
		kim.drive(t1);
		kim.drive(p1);
		kim.drive(s1);
		
		System.out.println("==================");
		
		Car c = kim.buyCar("테슬라");
		c.run();
	}

}
