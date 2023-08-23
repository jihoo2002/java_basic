package basic;

import java.util.Scanner;

public class Pre7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
	 
	 int numA, numB, numC;
	 
	 System.out.println("A의 값을 입력하시오: ");
	 numA = sc.nextInt();
	 
	 System.out.println("B의 값을 입력하시오: ");
	 numB = sc.nextInt();
	 
	 System.out.println("C의 값을 입력하시오: ");
	 numC = sc.nextInt();
	 
	 if((numA<numB && numA >numC) || (numA <numC&& numA>numB)) {
		 System.out.println("A가 중간값입니다." + numA); //a가 15 b가 20 c가 10
	 } else if((numB < numA && numB > numC) || (numB <numC && numB>numA)){
		 System.out.println("B가 중간값입니다." + numB);
	 }else {
		 System.out.println("C가 중간값입니다."+ numC);
			 
		 }
	 
	 }
	}


