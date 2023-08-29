package oop.String;

public class StringMethod {

	public static void main(String[] args) {
		
		String str = "Hello java";
		
		//charAt(index) :문자열 인덱스에 따른 단일 문자 반환.
		char c = str .charAt(4);
		System.out.println("4번 인덱스: " + c);
		
		//subString(begin, end)
		//:문자열을 범위를 지정하여 추출
		String ss1 = str.substring(0, 5); //1부터 5미만!!
		System.out.println("ss1의 값:" +ss1);
		
		String ss2 = str.substring(6);//6부터 끝까지 추출
		System.out.println("ss2: " +ss2);
		
		//length(): 문자열의 총 길이 반환
		int len = str.length();
		System.out.println("len의 길이: " +len);
	}

}
