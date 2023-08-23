package basic;

import java.util.Scanner;

public class Pre8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 한개를 입력하시오: ");
		int num = sc.nextInt();
		
		if (num >= 50) {
			System.out.println("50이상 수입니다.");
		}else {
			System.out.println("50미만 수입니다.");
		}
	sc.close();
	}

}
