package basic.loop;
import java.util.Scanner;
public class SwitchQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		- 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
//	     다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
//	     연산 결과를 출력해 주시면 됩니다. (switch문 사용)
//	     연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
//	     결과를 말씀해 주세요.
//	    */
		int num =0, num2 =0, total = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		 num = sc.nextInt();
		
		System.out.println("연산자를 입력하시오: ");
		String oper = sc.next();
		
		System.out.println("정수를 하나 더 입력하시오: ");
		 num2 = sc.nextInt();
		
		switch(oper) {
		case "+":
			 total  = num + num2;
			break;
		case "-":
			total = num - num2;
			break;
		case "*":
			total = num * num2;
			break;
		case "/":
			if(num2 ==0) {
				System.out.println("연산할 수 없는 입력값입니다");
				break;
			}
			total = num /num2;
			
			break;
		case "%":
			total = num%num2;
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			System.exit(0);
		
		
			
		}
		System.out.println("연산결과:" +num +oper +num2 + "=" + total );
	}

}
