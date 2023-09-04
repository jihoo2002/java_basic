package oop.inter.basic;

public interface Inter extends ParentInter{
	int num = 5; 
	
	void method1();
	
	
	public static void staticMethod() {
		System.out.println("나는 Inter의 메서드~~");
	}
}
