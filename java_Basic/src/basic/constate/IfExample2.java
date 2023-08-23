package basic.constate;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("나이를 입력하시오: ");
		int age = sc.nextInt();
		
		if(age >=20) {
			System.out.println("성인입니당");
		}else if(age >=17) {
			System.out.println("고등학생이시네여");
		}else if (age >=14) {
			System.out.println("중학생이시네용");
		}else if(age >=8) {
			System.out.println("초등학생이넹");
		}else {
			System.out.println("유치원생 귀요워");
		}
		sc.close();
	}

}
