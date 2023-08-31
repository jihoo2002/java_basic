package oop.poly.car;

public class Car {
	
	Tire frontLeft;
	Tire frontRight;
	Tire rearLeft;
	Tire rearRight; //타이어의 자식이면 쓸수 있다
	
	
	void run() {
		System.out.println("자동차가 달립니다.~");
	}
	
}
