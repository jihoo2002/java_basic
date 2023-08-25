package basic;
import java.util.Scanner;
public class Pretice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.
         
        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
       */
		
		
		
		System.out.println("입력받은 수: ");
		int num = sc.nextInt();
		
		
		int count =0;
		System.out.println("소수: ");
		
		for(int i=1; i<=num; i++) {
			int cnt =0; //바깥에 있으묜 안되는건가여?@?@
			
			//1부터 입력받은 수까지 반복
			for(int j =1; j<=i; j++) {
				if(i%j ==0) {
					cnt++; //약수갯수 세어줌
					
				}
			}
			if(cnt ==2) {
				System.out.println(i + " ");
				count++;
				
			}
			
		}
	System.out.println("\n소수의 개수: " +count +"개");
		
	}

}
