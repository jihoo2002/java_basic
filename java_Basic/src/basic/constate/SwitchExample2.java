package basic.constate;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오: ");
		int point = sc.nextInt();
		
		
		switch(point / 10) {
		case 10:
			if(point > 100) {
				System.out.println("잘못된 점수입니다.");
				break;
			}
			//점수가 100점이라면 case 9에 흘러내려 A학점이라는 결과를
			//도출하게 된다.!@!!!!!
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break;
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break;
		default:
			if(point > 100 || point < 0) {
				System.out.println("잘못된 점수입니다.");
			}else { //case 5이하들이 else로 빠지게 된다. 
				System.out.println("당신의 학점은 F입니다.");
			}
		} 
			
		
		
		
		
		sc.close();
	}

}
