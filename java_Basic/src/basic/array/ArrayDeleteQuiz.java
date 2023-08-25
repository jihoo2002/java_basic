package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
		System.out.println("현재 저장된 친구들: " +Arrays.toString(kakao));
		
		
		//1.삭제할 친구 입력받아서 삭제 진행
		//2. 입력받은 이름이 없으면 없다고 얘기
		//배열의 길이가 0이 될때까지 삭제를 반복해보세요.
		//0이 되었다면(지울친구가 없다면) 프로그램 종료
	
		
		while(true) {
			
			if(kakao.length ==0) {
				System.out.println("더이상 삭제할 친구가 없네요");
				System.out.println("프로그램을 종료합니다");
				break;
			}
			System.out.println("삭제를 원하는 친구를 입력하세요: ");
			String name = sc.next();
			
			boolean flag = false;
			for(int i=0; i<kakao.length; i++) {
			
				if(name.equals(kakao[i])) {
					flag = true;
					for(int j =i; j<kakao.length-1; j++) {
					
						kakao[j] = kakao[j+1]; //삭제
					
						
						}
					break;
					
					}
					
				
				}
			
			if(!flag) {
				System.out.println("그 친구는 존재하지 않습니다.");
			}else { //존재하는 값이라면..
				String[] temp = new String[kakao.length-1];
				for(int k =0; k<temp.length; k++) {
					temp[k] = kakao[k]; //중복된 값 , kakao의 배열 값들이 temp의 값에다 넣어짐
				}
				kakao = temp;
				temp = null;
				
				System.out.println("삭제 후 정보: " + Arrays.toString(kakao));
			}
		}
		sc.close();
	}

}
