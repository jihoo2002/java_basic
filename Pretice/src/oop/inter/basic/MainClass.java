package oop.inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Inter의 변수값: " +Inter.num);
		
		Inter.staticMethod();
		
		ImplClass1 i1 = new ImplClass1();
		
		i1.method1();
		i1.method2();
		i1.method3();
		i1.parentMethod();
		
		System.out.println("==============");
		
		Inter it1 = new ImplClass1();
		it1.method1();
		it1.parentMethod(); //inter는 상속받았기 때문에 자식의 메서드에 접근 가능한 것임
		
	((ImplClass1)it1).method2();
	
	((Inter2)it1).method2();
	
	Inter2 it2 = new ImplClass1();
	it2.method2();
	it2.parentMethod();
	
	
	((ImplClass1)it2).method1();
	((Inter)it2).method1();
	
	Inter it3 = new ImplClass2();
	Inter2 it4 = new ImplClass3();//상속관계, 인터페이스 관계여야 다형성이 진행됨
	
	ParentInter[] inters = {it1, it2, it3, it4};
	
	}

}
