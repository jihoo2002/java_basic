package basic;

import java.util.Scanner;

public class Pre12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		 */
		String[] name = {"슈퍼맨", "아무", "무지"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오: ");
		String name2 = sc.next();
		
		boolean x = false;
		
		for(int i=0; i<=name.length-1; i++) {
		if(name2.equals(name[i])) {
			name[i] = name[i+1];
			System.out.println("인덱스" + i +"번 삭제되었습니다.");
			x = true;
		}
		}
		if(!x) {
			System.out.println("없는 이름을 입력하셨습니다.");
		}
	}

}
