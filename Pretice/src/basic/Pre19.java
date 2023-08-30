package basic;
import java.util.Scanner;
public class Pre19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        1. 주민등록번호 13자리를 입력받습니다.
        2. 주민등록번호는 -을 포함해서 받을 예정입니다.
        3. 13자리가 아니라면 다시 입력받습니다.
        4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
        */
		Scanner sc = new Scanner(System.in);
		
		outer: while(true) {
			System.out.println("주민등록번호를 입력해주세요: ");
			System.out.print("> ");
			String nums = sc.next();
			nums = nums.replace("-", "");
			
			if(nums.length()!= 13) {
				System.out.println("다시 입력하셔야 합니다.");
			}else {
				System.out.println("등록되셨습니다.");
				char a = nums.charAt(6);
				
				if((a == '1') || (a == '3') ) {
					System.out.println("남성입니다.");
				}else if((a == '2')||(a == '4')) {
					System.out.println("여성입니다.");
				}
				break outer;
				
			}
		}
	}

}
