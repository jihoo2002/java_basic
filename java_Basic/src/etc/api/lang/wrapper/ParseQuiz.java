package etc.api.lang.wrapper;

import java.net.http.HttpConnectTimeoutException;
import java.text.Format;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

public class ParseQuiz {
	
	public static void main(String[] args) {
		/*
	주민등록번호를 입력받아서 다음과 같은 정보를 추출하여 출력합니다.

	ex) 입력값: 9201013-1234567 
	출력값: 1992년 10월 13일 31세 남자 
	// 9210131234567
	입력값: 040906-4123456
	출력값: 2004년 9월 6일 19세 여자 
	//
	입력값은 하이픈이 포함된 문자열이어야 합니다. 
	하이픈이 포함되어 있지 않거나, 주민등록번호 뒷자리 첫번째 숫자가 1,2,3,4가 아닐 시에는 다시 입력받아야 합니다.
	또한 하이픈을 제외한 값이 숫자가 아닐 시에도 다시 입력받아 주시면 됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 주민 번호 정보 ***");
		
		while(true) {
			System.out.println("입력값: ");
			String input = sc.nextLine();
			
			input = input.trim();
		
			if(!input.contains("-") ) {
					System.out.println("잘못된 주민번호입니다. 다시 입력하세요.");
					continue;
			
			}else {
				
				String[] part = input.split("-"); //하이픈 기준으로 앞뒤 나누기
				
				
				int year = Integer.parseInt(part[0].substring(0, 2));
				int month = Integer.parseInt(part[0].substring(2,4));
				int day = Integer.parseInt(part[0].substring(4,6));
				char first = part[1].charAt(0);
				
				
				if(!(first == '3' || first == '4'||first =='1' ||first =='2')) {
						System.out.println("잘못된 입력이에요 다시 입력하세요");
						continue;
				}
				
				int age =0;
				if(first == '3' || first == '4') { //3이거나 4면 2000년대 출생자
					age =20;
				}else { //아니면 1900년대 출생자
					age = 19;
				}
				
				int year1 = age * 100 + year;
				int age1 = 2023-year1;
				
				String gender = (first =='1' || first =='3')? "남자" : "여자";
				
				System.out.println("\n*** 주민 번호 등록 완료 ***");
				System.out.printf("%d년 %d월 %d일 %d세 %s", year1, month, day,age1, gender);
				
				sc.close();
				break;
			}
		
		}

	}


		
//		if(nums.charAt(6)=='4' || nums.charAt(6)=='2') {
//			System.out.println("여자입니다.");
//		}
	}


