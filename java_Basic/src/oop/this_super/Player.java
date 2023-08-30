package oop.this_super;

public class Player {
	
	String name; //멤버변수
	int level;
	int atk;
	int hp;
	
	
	Player() {
		System.out.println("player의 기본 생성자 호출!");
//		System.out.println("this의 주소값: " + this); //this는 메인에서의 객체 주소값 가짐
		this.level =1;
		this.atk =3;
		this.hp =50;
	}
	
	Player(String name) { //매개변수(지역변수)
		this(); //같은 클래스에 다른 생성자를 부르는 문법.,
		//즉 Player()를 가르킴
		//다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 합니다. 
		System.out.println("player의 2번 생성자 호출");
//		System.out.println("this의 주소값: " + this);
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
	//player는 그 자체로 객체타입이자 데이터 타입이라고 할수 있다. 
	//따라서 Player로 만든 p1, p2,p3가 target으로 저장된다. 
	
	void attack(Player target) {
		
//		System.out.println("target: " +target);
//		System.out.println("this: " + this); ///주소값
		if(this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}
//		target.hp = target.hp-10;
//		this.hp = hp+5; 
//		System.out.println("나의 체력 :" +this.hp +", 상대의 체력: " +target.hp);
		//출력 메세지 : x가 y를 공격합니다.
		System.out.printf("%s(이)가 %s(을)를 공격합니다.\n",this.name, target.name);
		//맞는 사람의 hp를 10 낮추고 나의 체력을 5회복하고 싶다.
		//결과 출력 (나의 체력: xx, 상대의 체력 :xx)
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
		//this가 메인으로 가면서 주소값이 달라지고 그 주소값을 가진 객체를 불러오게됨
	}
}
