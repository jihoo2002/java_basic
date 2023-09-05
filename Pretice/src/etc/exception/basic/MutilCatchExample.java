package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MutilCatchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		try {
			System.out.println("정수: ");
			int n = sc.nextInt();
			
			int result = 100/n;
			System.out.println(arr[result]);
			
			String s = null;
			s.equals("메롱");
		}catch(InputMismatchException | ArithmeticException e) {
			System.out.println("똑바로 입력해라!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 벗어났잖아@");
		}catch(Exception e) {
			System.out.println("예측하지 못한 에러 발생");
			System.out.println("에러 원인: " +e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
		sc.close();

	}

}
