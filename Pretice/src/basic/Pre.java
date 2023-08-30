package basic;

public class Pre {
	String name;
	int age;
	int height;
	/*
    Scanner를 이용해서 사용자에게
    이름, 나이, 키를 입력받아서 
    해당 정보를 저장하는 객체를 디자인 해 보세요.
    객체 내에는 해당 사람의 정보를 모두 출력 해 주는
    info() 메서드가 존재합니다.
    */
	Pre(){}
	
	Pre(String pName, int pAge, int pHeight) {
		name = pName;
		age = pAge;
		height = pHeight;
	}
	void info() {
		System.out.println("***입력 정보***");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
	}
}
