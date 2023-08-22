package basic;
import java.util.Scanner;
public class pretice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		/*
		 * 아래의 코드는 사과를 담는데 필요한 바구니 수를 구하는 코드이다.
		 *  만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
		 *   13개의 바구니가 필요할 것이다.
		 */
		System.out.println("사과 개수를 입력하시오: ");
		int numOfApples =scanner.nextInt(); //사과 개수
		System.out.println("바구니에 담을 수 있는 사과 개수 입력 :");
		int sizeOfBucket = scanner.nextInt();//바구니에 담을 수 있는 사과 개수
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket>0? 1:0) ;
		System.out.println("필요한 바구니 개수 :" + numOfBucket);
		//123을 10으로 나눈 값은 12 +
		//나머지 값이 3개가 0보다 크면 바구니 하나가 더 들어가는 삼항 연산자 사용
		
		//삼항 연산자 두번 쓴거 , num의 값에 따라 양수 음수 0을 출력해야함
		
		
		System.out.println("수를 입력하시오: ");
		int num = scanner.nextInt();
		System.out.println(num>0? "양수" :(num <0? "음수" : "0"));
	}

}
