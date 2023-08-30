package oop.this_super;

public class MainClass {
//메인 클래스에서는 객체를 생성하고 이 객체만이 들어갈 값을 정의하고 객체 호출을 한다.
	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.name = "플레이어1";
//		System.out.println("p1의 주소값 : " +p1);
		p1.characterInfo();
		
		
		System.out.println("=================");
		
		Player p2 = new Player("플레이어2"); //생성자player에 커서 두고 f3
//		System.out.println("p2의 주소값 : " +p2);
		p2.characterInfo();
		
		System.out.println("=================");
		
		Player p3 = new Player("플레이어3", 200);
//		System.out.println("p3의 주소값 : " +p3);
		p3.characterInfo();
		
		System.out.println("=================");
		
		p3.attack(p2); //attack(Player target)에서 this를 p3.~ 요렇게 정의한것임.
		p2.attack(p1);
		p1.attack(p3);
	
		
		System.out.println("=================");
		
		Warrior w1 = new Warrior("전사짱짱맨");
		w1.characterInfo();
	}

}
