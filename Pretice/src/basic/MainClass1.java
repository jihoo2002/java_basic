package basic;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person1 p1 = new Person1("권지후", 22, "여자");
//		p1.personInfo();
		Person1[] p1 = {
				new Person1("김철수", 32, "남자"),
				new Person1("이영회", 25, "여자"),
				new Person1("박뽀삐", 50, "남자")
		};
		
		for(Person1 p : p1) {
			p.personInfo();
			
		}
	}

}
