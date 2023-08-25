package basic;

import java.util.Scanner;

public class Pre10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hobby = {"노래듣기", "요리", "책읽기"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("탐색할 취미를 입력하시오: ");
		String name = sc.next();
		
		boolean flag = false;
		for(int i =0; i<hobby.length; i++) {
			//인덱스 0~2, length는 3
			if(name.equals(hobby[i])) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스" +i +"번");
				flag = true;
				break;
			}
		}
		 if(!flag) { //찾지 못했다면..
			 System.out.println("없는 취미입니다. ");
		 }
	}

}
