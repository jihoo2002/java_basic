package oop.inter.basic;

public class ImplClass1 implements Inter, Inter2{

	@Override
	public void parentMethod() {
		System.out.println("parentInter의 메서드를 상속 받음");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Inter2의 추상 메서드 구현@");
	}

	@Override
	public void method1() {
		System.out.println("Inter의 추상메서드 구현!");
		
	}
	
	public void method3() {
		System.out.println("ImplClass1의 메서드 구현");

	}

}
