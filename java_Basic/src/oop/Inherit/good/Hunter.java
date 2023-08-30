package oop.Inherit.good;

public class Hunter extends Player {
	
	String pet;
	
@Override // 제목 조금 쓰고 + ctrl + 스페이스 
void characterInfo() {
	super.characterInfo();
	System.out.println("-펫 이름: " +pet);
}
}


