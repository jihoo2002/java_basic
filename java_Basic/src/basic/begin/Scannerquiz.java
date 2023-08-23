package basic.begin;

import java.util.Scanner;

public class Scannerquiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		String name = sc.next();
		
		System.out.print("나이를 입력하시오: ");
		int age = sc.nextInt();
		
		int year = 2023-age;
		
		System.out.println("=================");
		System.out.println("이름: " +name);
		System.out.println("나이: " +age +"세");
		System.out.println("출생년도: " +year + "년");
		//System.out.printf("이름 : %s\n나이: %d세\n출생년도 : %d\n",
			//	name, age, 2023-age);
		sc.close();
	}

}
