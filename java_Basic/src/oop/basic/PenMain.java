package oop.basic;
//객체 생성용!
public class PenMain {

	public static void main(String[] args) {
		
		/*
		 * 설계도에 작성한 속성과 기능을 사용하려면
		 * 반드시 실체(객체)를 생성하셔야 합니다.
		 * 클래스만 제작된 채로는 아무 기능도 수행할 수 없습니다.
		 */
		//객체 생성 문법 : 클래스 타입 변수명 = new 클래스 이름();
		Pen redPen= new Pen(); //pen객체를 참조한 redPen이라는 객체생성 !
		Pen bluePen = new Pen(); //scanner객체와 비슷한 구조
		Pen blackPen =new Pen();
		
		//참조 연산자(.)를 통해 객체로 접근한 뒤
		// 속성을 지정하고 기능을 사용할 수 있다
		redPen.color = "빨강";
		redPen.price = 500;
		
		bluePen.color = "파랑";
		bluePen.price = 600;
		
		blackPen.color = "검정";
		blackPen.price = 1000;
		
		redPen.write();
		bluePen.write();
		blackPen.write();
		
		redPen.priceInfo();
		bluePen.priceInfo();
		blackPen.priceInfo();
		
		System.out.println(redPen); //주소값은 다름
		System.out.println(bluePen);
		System.out.println(blackPen);

	}

}
