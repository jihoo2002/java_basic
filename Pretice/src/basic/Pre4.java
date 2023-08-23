package basic;
import java.util.Scanner;
public class Pre4 {

	public static void main(String[] args) {
		
		System.out.println("나이를 입력하시오: ");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if(age >= 20) {
			System.out.println("성인입니다.");
		}else if (age >=17) {
			System.out.println("고등학생 입니다. ");
		}else if (age >=14) {
			System.out.println("중학생입니다.");
		}else if (age >=8) {
			System.out.println("초등학생입니다.");
		}else {
			System.out.println("미취학 아동입니다.");
		}
		scanner.close();
	}

}
