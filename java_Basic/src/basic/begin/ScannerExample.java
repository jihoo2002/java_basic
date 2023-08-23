package basic.begin;

import java.util.Scanner;

//1.Scanner api 로딩(제공되는 Scanner정보를 현재 클래스로 가져오자)


public class ScannerExample {

	public static void main(String[] args) {
		
		//2.스캐너 객체 생성 (scanner 입력 후 ctrl +스페이스
		Scanner scanner = new Scanner(System.in);
		
		/*
        3. Scanner의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
        - next(): 공백이 없는 문자열을 입력받습니다.
        - nextLine(): 공백을 포함한 문자를 입력받습니다.
        - next + 기본타입이름(): 해당 타입에 맞는 데이터를 입력받습니다.
        ex)
            nextInt(): 정수 데이터를 입력받습니다.
            nextDouble(): 실수 데이터를 입력받습니다.
        */
		
		System.out.print("이름을 입력하세요: ");
		String name = scanner.next();
		
		System.out.print("나이를 입력하세요: ");
		int age = scanner.nextInt();
		
		int birth = 2023 - age;
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("출생년도: " + birth);
		
		//4.scanner 객체를 반남
		//객체 반남 -> scanner객체를 메모리에서 해체
		scanner.close();
	}
}
