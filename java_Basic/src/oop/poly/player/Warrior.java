package oop.poly.player;

public class Warrior extends Player{
	
	int rage;
	Warrior(String name) {
		
		
		super(name);//매개값을 하나도 받지 않는 부모의 생성자 호출
		
		
		this.rage = 60; //this를 쓰면 더 명확해짐
	}//자바가상머신이 자동으로 만들어줌 !! 
	
	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("-분노: " +rage);
	}
}
