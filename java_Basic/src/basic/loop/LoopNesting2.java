package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		
		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.
         
        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
       */
       
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오: ");
		int num = sc.nextInt();
		//정수값까지 실행시킬 때마다 소수인지를 판별 --> 
		
		int count =0; //소수의 개수를 기억해줄 변수
		
		System.out.println("소수: ");
		for(int i =1; i<=num; i ++) {
			int cnt = 0; //소수의 판별을 위해서 약수의 개수를 세 줄 변수.
			//안쪽에 있어야 cnt가 계속 0인 상태임
			for(int j=1; j <=i; j++) { //자기자신까지 올라가야 약수를 판별할 수 있음
			if(i%j ==0) {
				cnt++; //소수는 1과 자기자신밖에 없기에 나머지값이 0임
			}
			}
			if(cnt ==2) {
				System.out.print(i + " ");
				count++;
			}
			}
		
		System.out.println("\n소수의 개수:" +count + "개");
	}

}
