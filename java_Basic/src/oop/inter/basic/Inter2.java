package oop.inter.basic;


//클래스가 상속 가능 한 것처럼 인터페이스도 extends 를 사용하여
//인터페이스 간의 상속 구현 가능
// 인터페이스 끼리는 다중 상속도 가능
public interface Inter2 extends ParentInter {
	
	int I = 5; //static fianl; 고정된 공유 변수 값
	
	void method2(); //abstract
}
