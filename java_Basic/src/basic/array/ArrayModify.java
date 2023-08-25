package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {
		
		String[] foods = {"삽겹살", "피자", "족발","햄버거"};
//		System.out.println(Arrays.toString(foods));
		
		foods[0] = "치킨";
		foods[2] = "탕수육";
	
		System.out.println(Arrays.toString(foods));
		
		System.out.println("========================");
		
		Scanner sc = new Scanner(System.in);
		//먼저 인덱스의 몇번인지를 알아야 함
		System.out.print("탐색할 음식을 입력하시오: ");
		String name = sc.next();
		
		boolean b = false;
		
		// 두번째 방법 : int i;
		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색완료");
				System.out.println("인덱스" + i + "번");
				b = true;
				break;
				
			}
			//첫번째 방법
//			}else if(i == foods.length-1) { //3개 
//				System.out.println("없는 음식입니다.");
//			}
			
			
		}
		//두번째 방법 
		//if(i == foods.length) {
	//	System.out.println("없는 음식입니다.");
	//  }	
		
		if(b == false) {
			System.out.println("없습니다. 다시 입력하세요.");
		}
//		if(name.equals !=name.equals(foods[i]) ) {
//			
//		}
			
		}
		}
		
	


