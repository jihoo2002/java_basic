package oop.poly.player;

public class Warrior extends Player{
	
	int rage;
	Warrior(String name) {
		
		
		super(name);//매개값을 하나도 받지 않는 부모의 생성자 호출
		
		
		this.rage = 60; //this를 쓰면 더 명확해짐
	}//자바가상머신이 자동으로 만들어줌 !! 
	
	
	public void rush(Player s) {
		/*
        - 전사의 고유 기능인 rush 메서드를 작성합니다.
        
        - rush의 대상은 모든 직업들 입니다.
        
        - 만약 rush의 대상이 전사라면 10의 피해를 받고,
         마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.
         
        - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
        
        - 남은 체력도 출력해 주세요.
        
        - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
        */
		
		System.out.printf("%s님이 %s님에게 돌진을 시전했습니다\n",
				this.name, s.name);
		if(s instanceof Mage) {
			s.hp -= 20;
			System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n", s.name, 50-s.hp, s.hp);
		}else if(s instanceof Hunter) {
			s.hp -=15;
			System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n", s.name, 50-s.hp, s.hp);
		}else if(s instanceof Warrior) {
			s.hp -= 10;
			System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n", s.name, 50-s.hp, s.hp);
		}
	}
	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("-분노: " +rage);
	}
}
