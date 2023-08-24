package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i =1;
//		int total = 0;
//		while(i<=10) {
//			total += i;
//			i++;
//		}
//		System.out.println(total);
		
//		int total = 0; //누적합 기억할 함수
//		for(int i=1;i<=10; i++) {
//			total += i;
//		}
		// 1~200까지 정수 중 6의 배수이면서 12의 배수가 아닌거
//		for(int i= 1; i<=200; i++) {
//			if(i%6==0 && i%12!=0) {
//				System.out.print(i + " ");
//			}
//		}
		System.out.println("==============");
//		int count=0;
//		for(int i = 1; i<=60000; i++) {
//			if(i%177==0) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		int num = sc.nextInt();
		
		int total =1;
		for(int i = num; i>=1; i--) {
			total *=i;
		}
		System.out.println("팩토리얼)" + total );
	}

}
