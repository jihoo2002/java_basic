package etc.enum_basic;

public class MainClass {

	public static void main(String[] args) {
	
		
		Developer kim = new Developer();
		kim.name = "김철수";
		kim.career = 3;
		kim.lang = Languages.JAVA; //고정값,
//		kim.lang = "한국어"; -->Languages의 값만 들어갈 수 있음
//		kim.lang = "메롱"; (o) 에러 안남 java타입이 String이라 값을 받을 수 있음 
		
		
		Developer hong = new Developer();
		hong.name = "홍길동";
		hong.career = 10;
		hong.lang = Languages.PYTHON; 
		
		
		Developer park = new Developer();
		park.name = "박뚜띠";
		park.career = 5;
		park.lang = Languages.JAVASCRIPT;
		//랭귀지 알아서 객체 생성 
		
		
		
		System.out.println("kim의 주력 언어: " +kim.lang);
		System.out.println("hong의 주력 언어: " +hong.lang.getName());
		System.out.println("park의 주력 언어: " +park.lang.getName());
		
		//values() : 열거형 타입에 존재하는 모든 상수를 배열에 담아서 리턴. 
		for(Languages lang: Languages.values()) {
			System.out.println(lang);
		}
		
		//ordina1() : 열거형 타입에 열거되어 있는 순서를 정수값으로 리턴
		System.out.println(kim.lang.ordinal()); //0번 인덱스 
		System.out.println(park.lang.ordinal()); 
		
		//valueOf(str): 매개값으로 전달된 문자열과 일치하는 요소를 리턴
		System.out.println(Languages.valueOf("CPP"));
//		System.out.println(Languages.valueOf("Merong")); 오류
		
		
		

	}

}
