package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[6];
		//아직 배열의 값이 정해지지 않았음
		
		for(int i =0; i<names.length; i++) {
			System.out.println("이름을 입력하시오: ");
			String name = sc.next();
			
			/*
            - 자바에서는 문자열 동등 비교 시 '==' 연산자를
             사용하면 제대로 비교가 되지 않습니다.
             
            - 문자열 String 타입이 기본 데이터 타입이 아닌
             객체 참조 타입이기 때문입니다.
             객체 참조 타입은 해당 값을 직접 들고 있는 게 아니라
             객체의 주소값을 들고 있기 때문에,
             문자열이 아무리 같더라도 주소가 다르면 false를
             도출합니다.
             
            - 그러므로 문자열 동등 비교를 진행할 때는
            [비교문자열1.equals(비교문자열2)] 를 사용하여
            진행해야 합니다.
            */
			
			if(name.equals("그만")) { //String은 그만이라는 글자를 비교하지 않고 그만이라는 문자열이 가진 
						//코드 번호를 가지고 같냐 다르냐를 판단하기 때문에 ==은 안됨.
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			names[i] = name; //입력받은 값을 인덱스 배열 안에 집어넣음
		}
//		System.out.println(Arrays.toString(names));
		System.out.println("==========================");
		System.out.println("입력받은 이름: ");
		
		for(String n : names) { //인덱스의 값들을 n에다 넣어준다
			if(n == null) break;  //null이 출력하게 하고 싶지 않을때 ..
			System.out.println(n + " ");
		}
		
		sc.close();
	}

}













