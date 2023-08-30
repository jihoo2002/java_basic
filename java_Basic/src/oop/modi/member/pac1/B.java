package oop.modi.member.pac1;

public class B {
 
	public B() {
		
		A a = new A(); //다른 클래스니까 객체 생성해야함
		a.x =1;
		a.y =2;
	//	a.z =3; private
		
		a.method1();
		a.method2();
//		a.method3();  private니까 안됨
		
	}
}
