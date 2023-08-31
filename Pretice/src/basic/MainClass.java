package basic;

public class MainClass {

	public static void main(String[] args) {
		
//메인 클래스에서는 객체를 생성하고 이 객체만이 들어갈 값을 정의하고 객체 호출을 한다.
		
		Player p1 = new Player(); 
		p1.name = "둘리";
		p1.characterInfo();
		
		
		System.out.println("==============");
		
		
		Player p2 = new Player("나라");
		p2.characterInfo();
		
		
		System.out.println("==============");
		
		
		Player p3 = new Player("보라돌이", 10);
		p3.characterInfo();
		
	
		
		
	}

}
