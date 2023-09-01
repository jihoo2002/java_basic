package oop.static_.singleton;

public class Singleton {
	
	//////////////////////////////////
	
	/*
	 * 싱글 톤 디자인 패던: 클래스 객체를 단 1개로 제한하기 위한 코드 디자인 패턴
	 * 
	   1. 외부에서 이 클래스의 객체를 생성하지 못하게 생성자를 단 1개만
	    선언하고 private 접근 제한을 붙임.
	    
	 */
	
	private Singleton() {//생성자 생성
		System.out.println("객체가 생성됨 !");
	}
	//2.생성자를 호출할 수 있는 영역은 같은 클래스 내부 뿐이기때문에
	// 자신의 클래스 내부에서 스스로의 객체를 단 1개만 생성함.
	
	private static Singleton s = new Singleton();
	//s가 static 선언하면 non-static이 아니기에
	//아래 return이 가능해짐
	//s는 공유된 값이기 때문에 외부에 숨겨주어야 접근 못함
	
	
	//3.외부에서 이 클래스의 객체를 요구할 시, 2번에서 미리 만들어 놓은
	// 단 하나의 객체의 주소값을 공개된 메서드를 통해 리턴합니다. 
	
	public static Singleton getInstance() { //getInstance라고 이름 짓는 것은 관례이다!
		return s; // 객체 주소값 리턴, static은 객체 생성 안하고도 부를 수 있음
	}
	
	public void method1() {
		System.out.println("여러 군데에서 쓰이는 중요한 메서드");
	}

	public void method2() {
		System.out.println("프로그램 내에서 꼭 한번 불러야 하는 귀한 메서드");
	}

}
