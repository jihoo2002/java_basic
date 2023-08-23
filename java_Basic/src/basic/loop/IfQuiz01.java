package basic.loop;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 /*
		         - 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰 지
		         혹은 같은지를 판별하시면 됩니다.
		         ex)
		         입력받은 수: 4, 7 -> 7이 큰 수 입니다.
		         입력받은 수: 10, 3 -> 10이 큰 수 입니다.
		         입력받은 수: 5, 5 -> 같은 수 입니다.
		        */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개 입력하시오: ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num >num2) {
			System.out.println("입력받은 수: " + num + "," + num2 +
					"->" + num + "이(가) 더 큰 수 입니다.");
		}else if(num2> num) {
			System.out.println("입력받은 수: " + num + "," + num2 +
					"->" + num2 + "이(가) 더 큰 수 입니다.");
		}else {
			System.out.println("입력받은 수: " + num + "," + num2 +
					"->" + "같은 수입니다.");
		}
		
	}

}
