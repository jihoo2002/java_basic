package basic;
import java.util.Scanner;
public class Pretice1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		String name = scanner.next();
		
		System.out.print("나이를 입력하시오: ");
		int age = scanner.nextInt();
		
		System.out.println("거주지를 입력하시오: ");
		String area = scanner.next();
		
		int birth = 2023-age+1;
		
		System.out.println("================");
		System.out.printf("이름: %s\n나이 : %d세\n출생년도: %d년\n 지역: %s\n"
				, name, age, birth, area);
		System.out.println("================");
		
		scanner.close();
	}

}
