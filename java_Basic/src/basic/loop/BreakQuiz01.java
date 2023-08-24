package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		
		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
       */
		//int rn3 = (int)((Math.random()*355) + 42);
		Scanner sc = new Scanner(System.in);
		
		//0.1 ~1.0미만  0부터 100까지 +1
		int count =0;
		int count2 = 0;
	
		while(true) { //101미만
			int rn = (int)((Math.random()*100) +1);
			int rn2 = (int)((Math.random()*100) +1);
			int rn3 = (int)((Math.random()*100) +1);
			int rn4 = (int)((Math.random()*100) +1);
			
			System.out.println(rn + "+" + rn2 + "=" + "???");
			
			
			System.out.print(">");
			int ans = sc.nextInt();
		
			if(ans == (rn+rn2) ) {
				System.out.println("정답입니다!");
				count ++;
			}else if(ans ==0) {
				System.out.println("종료합니다.");
				break;
			
			}else {
				System.out.println("틀렸습니다.");
				count2++;
			}
			
			System.out.println(rn3 + "-" + rn4 + "=" + "???");
			System.out.print(">");
			int ans1 = sc.nextInt();
			if(ans1 == (rn3-rn4)) {
				System.out.println("정답입니다.");
				count ++;
			}else if(ans1 ==0) {
				System.out.println("종료합니다.");
				break;
			
			}else {
				System.out.println("틀렸습니다.");
				count2++;
			}
			
			
		}
		
		System.out.println("============");
		System.out.println("정답횟수 :" + count + "회");
		System.out.println("오답횟수 :" + count2 + "회");
		
	}

}
