package quiz;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		int result =0;
		
		System.out.println("정수입력: ");
		n1 = sc.nextInt();
		System.out.println("정수입력: ");
		n2 = sc.nextInt();
		for(int i = n1; i<=n2; i++  ) {
			result +=i;
		}
		System.out.println(n1 + "+" + n2 + "=" + result);
		
		

	}

}
