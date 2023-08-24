package basic.loop;
import java.util.Scanner;
public class whileQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        - while문을 if else 로 나눠서 두번 쓰는 것은 지양하겠습니다.
//	        */
	Scanner sc = new Scanner(System.in);
	System.out.println("입력: ");
	int x = sc.nextInt();
	int y = sc.nextInt();
	
	
	
	
	int start =x;
	int end = y;
	
	if (x>y) {
		start = y;
		end = x;
	}
	
	int i = start;
	int j = end;
	int total = 0;
	while(i<= j ) {
		total += i;
		i++;	
		
	}
//	while(x>y) {
//		total += y;
//		y--;
//	}
	
	
	System.out.printf("%d부터 %d까지의 누적합계: %d ", start, end, total);
	}

}
