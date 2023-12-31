package oop.String;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		String str = "Hello java";
		
		//charAt(index) :문자열 인덱스에 따른 단일 문자 반환.
		char c = str .charAt(4);
		System.out.println("4번 인덱스: " + c);
		
		//subString(begin, end)
		//:문자열을 범위를 지정하여 추출
		String ss1 = str.substring(1, 5); //1이상  5미만!!
		System.out.println("ss1의 값:" +ss1);
		
		String ss2 = str.substring(6);//6부터 끝까지 추출
		System.out.println("ss2: " +ss2);
		
		//length(): 문자열의 총 길이 반환
		int len = str.length();
		System.out.println("len의 길이: " +len);
		
		//indexOf(str):해당 문자가 있는 인덱스를 반환
		//해당 문자가 존재하지 않으면 -1를 리턴
		
		int idx1 = str.indexOf("l"); //앞에서부터 탐색
		System.out.println("idx1:" +idx1);
		
		int idx2 = str.lastIndexOf("a"); //뒤에서부터 탐색
		System.out.println("idx2: " +idx2);
		//왼쪽을 기준으로 맨 뒤에 있는 인덱스 번호 ? 
		
		
		//여러 문자를 전달하면 시작 인덱스를 알려준다.
		int idx3 = str.indexOf("java"); //시작 인덱스 알려줌
		System.out.println("idx3: " +idx3);
		
		String str2 = "HeLLo WoRLd";
		
		String lower = str2.toLowerCase(); //일괄 소문자 변경
		System.out.println("str2의 소문자 변경:" +lower);
		
		String upper = str2.toUpperCase(); //일괄 대문자 변경
		System.out.println("upper:" +upper);
		
		//trim() : 문자열 앞 뒤 공백 제거
		String name = "                       홍길동                  ";
		System.out.println(name + "님 안녕하세용");
		
		System.out.println(name.trim() + "님 안녕하세용");
		
		//replace(old, new)
		//: 기존 문자열 내부의 old값을 모두 찾아서 new 문자열로 일괄 변경
		String java = "자바는 재밌습니다. 자바 커피는 맛있습니다.";
		System.out.println(java.replace("자바", "java"));
		System.out.println(java.replace("습니", "")); 
		
		//split : 문자열을 구분자로 구분하여 분할.
		//분할된 문자들은 String 배열에 담아서 리턴!
		String phone = "010-1234-5678";
		String[] numbers =phone.split("-");
		System.out.println(Arrays.toString(numbers));
		
		String pet = "멍멍이, 야옹이, 짹짹이";
		String[] pets= pet.split(", ");
		System.out.println(Arrays.toString(pets));
		
		System.out.println("======================");
		
		//문자열의 정수/실수 변환
		String s1 = "100";
		String s2 = "3.14";
		
		int i = Integer.parseInt(s1); //문자열을 정수형으로 변환
		double d = Double.parseDouble(s2); //문자열을 실수형으로
		
		System.out.println(i+d);
		//원래라면 문자열로 쭉 나열이지만, 정수, 실수로 변환했기에 실제로도 더해짐
		
		
		//valueOf :기본 타입을 문자열로 변경
		
		System.out.println(3+4);
		System.out.println(String.valueOf(3) + String.valueOf(4)); //문자열로 변경
		
	
	}

}
