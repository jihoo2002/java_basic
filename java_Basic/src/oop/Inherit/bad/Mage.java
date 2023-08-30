package oop.Inherit.bad;

import oop.Inherit.good.Player;

public class Mage extends Player {

	int mana;
	
	@Override // 제목 조금 쓰고 + ctrl + 스페이스 
	void characterInfo() {
		super.characterInfo();
		System.out.println("-정신력: " + mana);
	}
	
	
//		System.out.println("-정신력: " + mana);
	
}
