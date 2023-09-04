package oop.inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		//인터페이스는 객체를 생성할 수 없는 추상적인 개념입니다.
//		Inter i1 = new Inter(); (x)
		
		
		System.out.println("상수: " + Inter.num);
		Inter.staticMethod(); //static 데이터 호출은 가능
		
		
		ImplClass1 i1 = new ImplClass1();
		i1.method1();
		i1.method2();
		i1.method3();
		i1.parentMethod();
		
		
		System.out.println("=========================");
		/*
        - 다형성은 상속이 전제되어야 하는 것이 원칙이지만
         예외로 인터페이스와 클래스간의 구현 관계에서도
         다형성 발생을 허용합니다.
         인터페이스 변수 = new 객체();
        */
		
		
		Inter it1 = new ImplClass1(); //다형성
		//method2, 3는 ImplClass만이 가진 고유 메서드 
		
		it1.method1();
		it1.parentMethod(); //parentInter를 상속받은 Inter이기에 상속됨
		
		
		//연산자 우선순위
		//괄호() ->참조(.) ->단항 ->2항->3항->대입
		((ImplClass1)it1).method2();
		//.의 연산자 우선순위가 더 먼저이기에 .앞이 먼저 실행되기 전에
		// it1.method2()이 먼저 실행된다.
		//그래서 ()를 한번 더 씌어서 우선순위를 .앞으로 옮겨줌
		
		
		/*
        - 인터페이스의 다형성도 앞에서 배운 클래스의 다형성처럼
         정보가 없다면 메서드 호출이 불가능하기 때문에 형 변환이 필요합니다.
         
        - 구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
         구현하는 클래스들끼리 서로 즉시 형 변환이 가능합니다.
        */
		((Inter2)it1).method2(); //ImplClass는 inter, inter2다 가지고 있기에 
		//ImplClass를 Inter2로 바꿔도 된다. 
		
		Inter2 it2 = new ImplClass1(); //
		it2.method2();
		it2.parentMethod();
		
		((Inter) it2).method1(); //inter2는 method1메서드가 없기에 형변환해야함
		
//		Inter2 it3 = new ImpleClass2(); //interface가 inter 하나 라서
		
		Inter it3 = new ImpleClass2();
		Inter2 it4 = new ImplClass3();
		
		ParentInter[] inters = {it1, it2, it3, it4};
		//객체들을 부모 배열에 다 담을 수 있다
	
	}

}
