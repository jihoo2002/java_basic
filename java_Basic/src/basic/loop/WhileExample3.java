package basic.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		
		/*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		  인지를 판별하시면 됩니다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		int num = sc.nextInt();
//		
//		int i = 1; //소수의 판별을 위해서 입력받은 정수 num을 지속적으로 나누어 볼 변수.
//		int count = 0; //나누어 떨어질 횟수를 기억할 변수
//		
//		while(i<=num) {
//			if(num%i == 0) {
//			count ++; //나누어 떨어졌을 때마다 카운트가 올라감
//			}
//			i++;
//		}
//		
//		if (count ==2) {
//			System.out.println(num + "은 소수입니다.");
//		}else {
//			System.out.println(num + "은 소수가 아닙니다.");
//		}
//		
//		System.out.println("=============");
		
		int j =2;
		while(num%j !=0) {
			
			j++; //만약 약수라면 1과 자기자신만 갖기 때문에 j가 자기자신이 될때까지 
			     //계속 j를 증가시킨다. 
				//즉 약수라면 1은 무조건 가지고 있기에 1을 배제시키고 증가시킨다.
		}
		System.out.println(num == j? "소수입니다." : "소수가 아닙니다.");
		sc.close();
	}

}
