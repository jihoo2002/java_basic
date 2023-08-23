package basic;

import java.util.Scanner;

public class Pre9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("학년과 점수를 입력하시오: ");
		int grade = sc.nextInt();
		int score = sc.nextInt();
		
		String msg = "잘못 입력하셨습니다.";
		if (score >=0 && score <=100) {
			if(score >=60) {
				if(grade !=4) {
					msg = "합격하셨습니다.";
				}else if(score >=70){
					msg = "합격하셨습니다.";
				}else {
					msg = "불합격하셨습니다.";
				}
					
			
		}else {
			msg = "불합격하셨습니다";
		}
			
		
	
	}
		System.out.println(msg);
sc.close();
	}
}
