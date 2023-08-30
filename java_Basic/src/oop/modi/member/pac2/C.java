package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {

	public C() {
	
		A a = new A();
		a.x =1; 
//		a.y =2; default
//		a.z =3; private
		
		a.method1(); //2, 3는 접근 제한 때문에 안됨 
	}
}
