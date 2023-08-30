package oop.pack;
//작성중인 패키지와 다른 곳에 위치한 클래스를 사용하려면 import 선언 필요
//import oop.fruit.Apple; //외부 패키지의 클래스이기에 끌고 와야 함!
////Apple뒤에 커서 ctrl +스페이스 
//import oop.fruit.Banana;
//import oop.fruit.Melon;
import oop.fruit.*; //fruit 패키지의 모든 클래스를 import하겠따

public class MainClass {

	public static void main(String[] args) {
		
		//다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
		//반드시 패키지 경로를 직접 표시해 주어야 합니다. 
		
		
		Apple apple = new Apple(); 
		oop.juice.Apple a2 = new oop.juice.Apple(); //Apple이라는 이름이 중복되기에 
		// Apple을 쓰려면 경로를 써주어야 함
		Banana b = new Banana();
		Melon m = new Melon();
		

	}

}
