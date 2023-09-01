package oop.final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person kim = new Person("김철수");
//		kim.nation = "미국"; (x)
//		kim.name = "김마이클"; x ->객체 생성떄 김철수로 초기화함
		kim.age = 30;
		
		Person park = new Person("박영희");
//		park.nation = "영국"; 안됨
//		park.name = "박영국"; 

	}

}
