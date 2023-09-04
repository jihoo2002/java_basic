package oop.inter.basic;
/*
1. 인터페이스를 작성한 후에는 클래스를 생성해서
 인터페이스에 명세된 내용을 구현하시면 됩니다.
 
2. 인터페이스의 구현 키워드는 implements 입니다.
 상속과 같이 클래스 이름 뒤에 구현하고자 하는 인터페이스 이름을 작성합니다.
 
3. 인터페이스에 선언된 추상 메서드는 반드시 구현 클래스에서
 오버라이딩을 진행해야 합니다.
 
4. 인터페이스는 하나의 클래스에서 여러 개의 인터페이스를
 동시에 다중 구현할 수 있습니다.
*/

public class ImplClass1 implements Inter, Inter2{
									//다중 구현
	@Override
	public void method1() {
		System.out.println("Inter의 추상 메서드 구현!");
		
	}//inter에서 선언된 추상메소드 method1를 재정의 

	
	@Override
	public void method2() {
		System.out.println("Inter의 추상 메서드 구현!");
		//inter2에서 선언된 추상 메소드 method2를 재정의 
	}


	@Override
	public void parentMethod() {
		System.out.println("부모 인터페이스 메서드 구현");
		//inter, inter2 가 상속받은 ParentInter의 메소드 
		
	}
	
	public void method3() {
		System.out.println("ImplClass1의 메서드 구현 ");
		//ImplClass1의 자체적인 메소드 
	}
	

}
