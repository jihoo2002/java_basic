package basic.array;

import java.util.Scanner;

public class ArrayinsertQuiz {

	public static void main(String[] args) {
		
		/*
        1. String 배열을 생성하세요. (foods)
        크기는 넉넉하게 50개로 지정하겠습니다.
        
        2. 사용자에게 음식 이름을 입력받아서 배열에
         삽입해 주세요.
         사용자가 음식 입력창에 '배불러' 라고 작성하면
         입력을 종료해 주세요.
         
        3. 입력이 종료되면 사용자가 입력한 음식을
        가로로 출력해 주세요. (null은 출력하지 마세요.)
        
         추가 문제 
        - 입력을 받았는데 이미 배열에 존재하는 음식이라면
        '이미 존재하는 음식입니다.' 를 출력하고
        다시 새로운 음식을 입력받을 수 있도록 코드를 제어해 보세요.
        
       */
		String[] foods = new String[50];
		Scanner sc = new Scanner(System.in);
		
		
		outer: for(int i=0;i<foods.length;i++) {
		
		System.out.println("음식을 입력해주세요: ");
		String food = sc.next();
		
		
		
		
		if(food.equals("배불러")) {
			System.out.println("종료합니다");
			break;
			
		}
		
		
		for(String c: foods) { //foods배열 속에 있는 값을 c에다 저장, 
			if(food.equals(c)) { //c의 값이 food의 값과 같냐
				System.out.println("이미 존재하는 음식입니다.");
				i--; //continue를 진행시키면 증감식이 발동되고 인덱스가 뛰어넘고 다음회차로 넘어감
				//이를 방지하기 위해 인덱스의 값을 하나씩 줄어들게 만들어야 함
				continue outer;
			}
		}
//		if(food.equals(foods[i])== food.equals(foods[i+1])) {
//			System.out.println("중복된 음식입니다.");
//			continue;
//			
//		}
		
		foods[i] = food;
		}
		System.out.println("====================");
		System.out.println("먹고싶은 음식: ");
		
		for(String f : foods) {
			if(f == null) break;
			
			System.out.print(f + " ");
		}
	}

}
