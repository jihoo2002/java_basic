package oop.this_super;

public class Warrior extends Player{
	
	int rage;
	Warrior(String name) {
		
		//모든 생성자에는 super()가 내장되어있습니다.
		//자식 객체가 생성될 때에는 부모의 객체도 생성이 되어야 함
		//그래야 부모의 속성과 기능이 실존하게 되고, 물려줄 수 있기 때문
		super(name);//매개값을 하나도 받지 않는 부모의 생성자 호출
		//부모 생성자에 this.name = name이 있기 때문에 suepr(name)으로 해두 된당
		
		this.rage = 60; //this를 쓰면 더 명확해짐
	}//자바가상머신이 자동으로 만들어줌 !! 
	
	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("-분노: " +rage);
	}
}
