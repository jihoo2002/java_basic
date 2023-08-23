package basic;
import java.util.Scanner;
public class Pre6 {
 public static void main(String[] args) {

	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("학년을 입력하시오: ");
	 int grade = scanner.nextInt();
	 System.out.println("점수를 입력하시오: ");
	 int score = scanner.nextInt();
	 
	 String msg = "불합격입니다.";
if (score <0 && score >100) {
	if(score >=60) {
		if (grade !=4 ) {
			msg = "합격입니다.";
			//4학년이라면..
		}else if(score >=70) {
			msg = "합격입니다.";
		}else { //4학년이 70점 미만이면..
			msg = "불합격입니다.";
		}
		
	}else {
		msg = "불합격입니다.";
	}
	
	}
	System.out.println(msg);
 }
	}
