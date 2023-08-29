package oop.String;

import java.util.Scanner;

public class StringQuiz {

	public static void main(String[] args) {
		
		/*
        1. 스캐너를 통해 id를 입력받습니다.
        2. 말썽꾸러기 사용자는 id에 공백을 입력할 확률이 굉장히 높습니다.
        3. 공백을 제거한 아이디가 5글자 미만이라면 다시 입력받으세요.
        4. 5글자 이상 입력되었다면 "id가 등록되었습니다." 출력후
        종료하세요.
        */
		Scanner sc = new Scanner(System.in);
		
		
		
		/*
		 * //length(): 문자열의 총 길이 반환
		int len = str.length();
		System.out.println("len의 길이: " +len);
		 */
		
		
		while(true) {
			System.out.println("id를 입력해주세요: ");
			String id = sc.nextLine(); //공백까지 입력되서 저장됨
			id =id.trim();
			id = id.replace(" ", "");
			
		if(id.length()<5) {
			System.out.println("5글자 이상이어야 합니다. ");
			String id2 = sc.next();
		}else {
			System.out.println("id가 등록되었습니다.");
			break;
		}
		}
		
		
	}

}
