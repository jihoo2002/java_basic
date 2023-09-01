package oop.static_.singleton;

public class Main {

	public static void main(String[] args) {
		
//		Singleton s = new Singleton();
//		s.method1();
//		s.method2();
//		
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		s1.method1();
		s1.method2();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		
		
		
		
		
	}

}
