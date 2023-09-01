package oop.polycasting;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 =2; n2는 자식의 변수이기에 !
		
		p.method1();
		p.method2();
//		p.method3();자식 메서드이기에!
		
		
		System.out.println("====================");
		
		Child c = new Child();
		c.n1 =1; //부모에게 물려받은 속성
		c.n2 =2; //자식의 고유 속성
		
		c.method1();
		c.method2();
		c.method3();
		
		System.out.println("======================");
		
		//다형성 적용(promotion)
		Parent p2 = new Child();
		//p2에는 Parent 객체가 들어가있다. 고유한 값은 전달할 수 없다.
		p2.n1 =1;
//		p2.n2 =2;  (x)
		
		p2.method1();
		p2.method2(); //자식 쪽에서 새로 재정의한 객체 생성됨
//		p2.method3(); (x)
		
		
		/*
		 * 다형성이 적용되면 자식 클래스의
		 * 본래 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
		 * 
		 * 이를 해결하기 위해 강제 타입 변환을 사용합니다. (자식의 타입을 바꿔야함)
		 */
		
		
		Child c2 = (Child)p2; //자식 주소값을 가진 p2에 child타입에 c2에게 넘겨주겠다
		//p2가 c2보다 더 상위타입이기에 강제 형변환 해야함,객체 생성은 아님
		
		//부모타입을 자식 타입으로 강제 변환(Downcasting)
		
		//즉 parent타입의 p2를 하위 타입 child으로 형변환 해줌
		c2.n2 = 2;
		c2.method2();
		c2.method3();
		System.out.println("p2의 주소값: " +p2);
		System.out.println("c2의 주소값: " +c2); //주소 똑같
		
	 Object o = new String("안녕하세용");
	//부모는 자신이 물려줘서 변형된 메서드와 필드를 알 수 있지만
	 //자식이 스스로 생성한 것들은 접근할 수 없다. 
	 
	 String str = (String)o;
	 System.out.println("문자열의 길이: " +str.length());
	 //length는 string에서 자체적으로 갖고 있기에 object가 접근할수 x
	 
	 //다형성이 한번도 발생하지 않은 경우에는
	 // 강제 형 변환을 사용할 수 없음
	 
	 Parent ppp = new Parent(); //다형성이 적용되지 않음(부모타입 변수에 자식 타입 주소값을 넣어야 함)
//	 Child ccc = (Child) ppp; (x)
	 
	 //자식 객체가 생성되면 부모 객체도 자동으로 생성되지만
	 // 부모 객체가 생성되면 자식 객체는 생성되지 않아 오류
	}

}














