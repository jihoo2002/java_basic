package basic;

public class Player  {
	//모든 객체들의 기본 기능값과 기능 출력을 갖고 있는 클래스 생성

	String name;
	int level;
	int atk;
	int hp;
	
	Player() {
		System.out.println("player의 기본 생성자 호출");
		this.level =1;
		this.atk = 3;
		this.hp = 50;
		
	}
	
	Player(String name) {
		this();
		System.out.println("매개변수 하나 player 생성");
		this.hp = 70;
		this.name = name;
		
	}
		
	Player(String name, int hp) {
		this(name);
		System.out.println("매개 변수 두개 player 생성");
		this.hp= hp;
	}
		
	void attack(Player target) {
		if(this == target) {
			System.out.println("스스로 때릴 수 없습니다.");
			return;
		}
		//출력 메세지 : x가 y를 공격합니다.
		System.out.printf("%s(이)가 %s");
	void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("아이디 : " +name);
		System.out.println("레벨 : " +level);
		System.out.println("공격력 : " +atk);
		System.out.println("체력 : " +hp);
		
	
		
	}
	
	
	}

