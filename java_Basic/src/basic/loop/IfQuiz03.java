package basic.loop;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		/*
		         - 정수 3개를 입력 받습니다.
		         - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
		         
		         # max, mid, min이라는 변수를 미리 선언하셔서
		          판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
		          마지막에 한번에 출력하시면 되겠습니다.
		         */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int max =0; 
		int mid =0;
		int min = 0;
		 
		
		if((num1>num2&&num1<num3)||(num1<num2 &&num1>num3)) {
			//1이 제일 중간값일때 2가 제일 작은 값 3이 제일 큰 값
			System.out.println(num1 +"이 중간값입니다.");
			
			if(num2<num3) {
				System.out.println(num2 +"이 가장 작은값입니다.");
				System.out.println(num3 +"이 최댓값입니다.");
			}else if(num3<num2) {
				System.out.println(num2 +"이 가장 큰값입니다.");
				System.out.println(num3 +"이 가장 작은값입니다.");
			}
				
		
		
			
		}else if((num2>num1 && num2<num3)||(num2<num1 && num2>num3)) {
			//2이 제일 중간값일때 
			System.out.println(num2 +"이 중간값입니다.");
			if(num1<num3) {
			System.out.println(num1 +"이 가장 작은값입니다.");
			System.out.println(num3 +"이 최댓값입니다.");
			
				}else if(num3<num1) {
					System.out.println(num1 +"이 가장 큰값입니다.");
					System.out.println(num3 +"이 가장 작은값입니다.");
				}
			
		}else {
		System.out.println(num3 + "이 중간값입니다.");
		
	}
		

	}
	}

