package oop.String;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		/*
        1. 주민등록번호 13자리를 입력받습니다.
        2. 주민등록번호는 -을 포함해서 받을 예정입니다.
        3. 13자리가 아니라면 다시 입력받습니다.
        4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
        */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("주민등록번호를 입력해주세요: ");
			String nums = sc.next();
			
			nums = nums.replace("-", "");
			if(nums.length()!=13) {
				System.out.println("다시 입력해주세요");
				
			}else {
				System.out.println("등록되셨습니다.");
				char c = nums.charAt(6);
				
				
				if((c == '3')||(c=='1')) {
					System.out.println("남자입니다.");
				}else if((c == '2')||(c=='4')) {
					System.out.println("여자입니다.");
				}
				break;
			}
			//1,3//2,4
			/*
			 * char c = str .charAt(4);
		System.out.println("4번 인덱스: " + c);
			 */
			
		}
		

	}

}
