package basic.begin;

public class identifier {

	public static void main(String[] args) {
	
		//1.식별자 이름은 중복을 허용하지 않는다
		//그리고, 대/소문자를 철저하게 구분한다.
		
		int age = 35;
//		int age = 40;
		int Age = 40;
		
		System.out.println(age);
		System.out.println(Age);
		
		//2.식별자 이름은 숫자로 지정하거나 숫자로 시작하면 안된다.
//		int 700 = 365;
//		int 7number = 7;
		int number7 = 7;
		int num7ber = 7;
		int num123456ber = 123;
		
		//3.식별자 이름에 공백 포함할 수 없다.
//		int my birth day = 19921013;
		int myBirthDay = 19921013; //카멜케이스 표기법
		
		//4. 식별자에 쓸 수 있는 특수 문자는 밑줄(_), 달러 기호($)
		//뿐입니다. 하지만 사용 권장 안함 ~~
		//저 특수문자들은 사용하기로 약속된 곳이 지정되어 있음
		//특수 문자들은 상수를 변수로 선언할 때 주로 사용됨
		String $hello = "안녕";
		
		//5.키워드(예약어)는 식별자 이름으로 사용이 불가능하다.
		//키워드는 이미 어떠한 내용을 내포하고 있는 지정문자이다. 
//		String class = "클래스";
		String Class = "클래스"; //대문자로 시작해서 선언 되지만 권장 x
		String className = "클래스";
		
		//6. 한글이나 한자 같은 식별자 이름도 지정이 가능합니다만
		//사용을 권장하지 않습니다.
		int 숫자 = 10;
		String 名 = "춘식이";
		System.out.println(名);
		
	}

}
