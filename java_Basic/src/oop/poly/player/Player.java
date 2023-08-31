package oop.poly.player;

public class Player {
	
	String name; //멤버변수
	int level;
	int atk;
	int hp;
	
	
	Player() {
		System.out.println("player의 기본 생성자 호출!");

		this.level =1;
		this.atk =3;
		this.hp =50;
	}
	
	Player(String name) { //매개변수(지역변수)
		this(); //같은 클래스에 다른 생성자를 부르는 문법.,
		//즉 Player()를 가르킴
		//다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 합니다. 
		System.out.println("player의 2번 생성자 호출");

//		level =1;
//		atk =3;
//		hp =50;
		this.name = name; 
	}
	
	Player(String name, int hp) {
		this(name);	//즉 Player(String name)를 가르킴
		System.out.println("player의 3번 생성자 호출");
		//this.name = name;
		this.hp = hp;
	}
	
	
	void attack(Player target) {
		

		if(this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}

		System.out.printf("%s(이)가 %s(을)를 공격합니다.\n",this.name, target.name);
		
		target.hp -= 10;
		this.hp += 5;
		System.out.printf("나의 체력: %d, 상대방 체력 %d\n",this.hp, target.hp);
	}
	
	
	void characterInfo() { //기능
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("- 아이디: " + name);
		System.out.println("- 레벨: " + level);
		System.out.println("- 공격력: " + atk);
		System.out.println("- 체력: " + hp);
		System.out.println("이 메서드를 호출한 객체의 이름: " +this.name);
	
	}
}
