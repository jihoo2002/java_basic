package basic;

import java.util.Arrays;

public class Pre17 {
	static String[] foods = {"떡볶이", "치킨", "파스타"};
	//1. 배열의 맨 마지막 위치에 데이터를 추가하는 함수 (push -> void)
	//기존 배열보다 크기가 하나 큰 배열을 선언해서 값 고대로 내리기
	//매개값으로 전달된 값을 마지막 위치에 채우기
	
	static void push(String x) {
		String[] temp = new String[foods.length+1]; //크기가 하나 큰 배열 선언
		for(int i =0; i<foods.length; i++) {
			temp[i] = foods[i]; //temp에다 foods 값 집어넣기
			temp[temp.length-1] = x; 
		}
		foods = temp; temp = null;
	}
	
	
	//2. 배열 내부 데이터 단순 출력 함수
	static void printFood() {
	    System.out.println(Arrays.toString(foods));
	}
	
	//3. 배열 내의 특정 음식의 위치를 찾아주는 함수 (indexOf -> int)
	// 매개값을 전달하면 해당 매개값이 배열 내의 몇 번 인덱스인지를 리턴하는 함수
	// 존재하지 않는 값이라면 -1을 리턴.
	static int indexOf(String n) {
		for(int i =0; i<foods.length; i++) {
			if(n.equals(foods[i])) {
				return i;
			}
		}return -1; //배열 안에 존재하지 않는 값
	}
	
	//4. 특정 음식의 배열 포함 여부 (include -> boolean)
	//매개값으로 전달된 음식이 배열에 포함되어있는지의 여부를 판단.
	//힌트 -> indexOf 메서드를 활용하면 쉽게 끝남.
	static boolean inclode(String s) {
		return indexOf(s) != -1; 
		/*
		 * indexOf라는 메서드가 위에서 
		 * foods 배열과 매개변수의 값을 비교하는 메서드로 애초에 지정
		 * 그래서 indexOf(s)이면 s의 값과 foods[i]의 값을 비교해줌 
		 */
	}
	//5. 특정 음식 제거 함수 (remove -> void)
	//전달된 음식을 배열에서 삭제하고 배열의 길이를 줄이면 된다.
	static void remove(String targetName) {
		int idx = indexOf(targetName);
		if(idx == -1) {
			System.out.println("존재하지 않는 음식입니다.");
		}else {
			for(int i = idx; i<foods.length-1; i++) {
				foods[i] = foods[i+1]; //값 땡기기
			}
			String[] temp = new String[foods.length-1];
			for(int j =0; j<temp.length; j++) {
				temp[j] = foods[j];
			}
			foods = temp; temp = null;
		}
	}
	//6. 특정 음식 수정 메서드 (modify -> void)
	//매개값으로 전달한 인덱스의 값을 전달한 값으로 수정해 주는 메서드
	static void modify(int targetidx, String target) {
		foods[targetidx] = target;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printFood();
		push("고구마");
		push("김치찌개");
		printFood();
		
		System.out.println("김치찌개의 인덱스 값: " +indexOf("김치찌개"));
		System.out.println("망고의 인덱스 값: " + indexOf("망고"));
		System.out.println("김치찌개의 존재여부: " +inclode("김치찌개"));
		System.out.println("망고의 존재여부: " +inclode("망고"));
	
		
//배열 내부를 한번 출력 후, '라면', '김치찌개' 추가한 뒤 배열 출력하기
        
        //파스타의 인덱스 알아내기
        
        //김치찌개의 인덱스 알아내기
        
        //짜장면의 인덱스 알아내기(존재하지 않는 값)
        
        //김치찌개, 망고 지우기 (망고는 존재하지 않는 값)
		remove("김치찌개");
		remove("망고");
		remove("고구마");
		printFood();
        //라면의 존재 여부 출력
        
        //양념치킨의 존재 여부 출력
        
        //2번 인덱스 데이터를 닭갈비로 수정
		modify(2, "닭갈비");
		printFood();
	}

}
