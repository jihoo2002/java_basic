package basic.begin;
import java.util.Scanner;
public class CellToFahr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        사용자에게 섭씨온도를 입력받아서
        화씨온도로 변환하여 출력하는 로직을 작성하세요.
        변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
        화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
        # ㄹ 한자 7 -> (℃),   ㄹ 한자 다음장 4 -> (℉)
        */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨온도를 입력하시오(°C):");
		int cel = sc.nextInt();
		
		//(0°C × 9/5) + 32 = 32°F
		double fah = (cel *9.0/5) +32;
		//9로 하면 오른쪽에서 int값으로 계산해 더블로 저장됨 
		//따라서 오른 쪽 값 중에 소수점을 붙여주거나 
		//cel값을 애초에 double로 받으면 된다.
		
		//System.out.printf("합격률: %.2f%%입니다." , rate );
		System.out.printf("화씨온도: %.1f°F입니다." , fah);
		
		sc.close();
	}

}
