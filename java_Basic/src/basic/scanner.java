package basic;
import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 :");
		String name = scanner.next();
		
		System.out.print("나이를 입력하시오 :");
		int age = scanner.nextInt();
		
		System.out.print("제 이름은 " + name +"이고, 나이는 " + age + "살 입니다." );

		System.out.println("지역 :");
		String area = scanner.next();
		
		System.out.print("취미 :");
		String hobby = scanner.next();
		
		System.out.print("사는 곳은 " + area + "이고, 취미는 " + hobby + " 입니다.");

		
	}

}
