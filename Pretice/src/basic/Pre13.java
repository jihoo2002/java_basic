package basic;

import java.util.Scanner;

public class Pre13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 문자를 입력하시오: ");
		String name = sc.next();
		
		String[] st = new String[100];
		
		for(int i=0; i<st.length; i++) {
			st[i] = name;
			
		}
		System.out.println("10개의 문자: " +name);
		
	}

}
