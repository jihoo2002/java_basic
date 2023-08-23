package basic;
import java.util.Scanner;
public class Pre5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res2;
		System.out.println("돈액수를 입력하십시오 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int totalNum = num;
		
		int res = totalNum /50000;
		totalNum = totalNum - (res * 50000);
		System.out.println("5만원 갯수 : " +res);
		
		
	}
}
