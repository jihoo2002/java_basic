package oop.poly.player;

public class Mage extends Player {
	
	
	int mana;
	
	Mage(String name) {
		super(name);
		this.mana = 100;
	}
	public void blizzard(Player p) {
		if(this == p) {
			return;
		} //0~5 +10
		
		
		p.hp -=((Math.random()*5)+10) ;
		System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n",
				p.name, 50-p.hp,p.hp);
		
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("-정신력: " +mana);
		
	}
}
