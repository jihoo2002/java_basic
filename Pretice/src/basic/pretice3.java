package basic;
import java.util.Scanner;
public class pretice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하시오: ");
		
		//char형 데이터를 scanner로 값 받는 방법!
		char ch = scanner.next().charAt(0);
		boolean b = (ch >='A'&& ch <='Z')||(ch >='a'&& ch <='z')||(ch>='0'&& ch<='9');
		System.out.println(b);
	}

}
