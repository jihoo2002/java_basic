package oop.obj_arr;

import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
	
		/*
		     - Score 객체를 담을 수 있는 배열을 선언하세요.
		       배열의 크기는 넉넉하게 100개로 하겠습니다.
		          
		     - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
		      입력받은 후, 입력받은 점수를 토대로 Score 객체를 생성하세요.
		      총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
		      (직접 넣으시든, 메서드를 하나 만들어서 계산하시든 마음대로~)
		       객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
		       이름 입력란에 '그만' 이라고 입력하면 반복문을 종료시켜 주세요.
		         
		       - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 순회하면서
		        scoreInfo()를 모두 불러주세요. (반복문)
		        주의!) 입력이 중간에 그만두어진다면, 배열의 나머지 인덱스는
		        모두 null로 가득 차 있습니다. (null.scoreInfo() -> 에러)
		         */
		
		Scanner sc = new Scanner(System.in);
		Score[] score = new Score[100];
		
		
		 for(int i =0; i<score.length; i++) {
	
			System.out.println("*** 학생 점수 입력 프로그램 ***");
			System.out.println("[그만]을 입력하시면 종료됩니다.");
			int total =0;
			double avg = 0.0;
			
			System.out.print("이름: ");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			System.out.print("국어점수: ");
			int lang = sc.nextInt();
			
			
			System.out.print("영어점수: ");
			int eng = sc.nextInt();
			
			
			System.out.print("수학점수: ");
			int math = sc.nextInt();
		
			
			
			total = lang + eng + math;
			System.out.print("총점:" +total + " ");
			
			avg = (double)total/3;
			System.out.printf("평균:%.1f\n",avg);
			
			Score s = new Score(name, lang, eng, math,total,avg);
			score[i] = s;
			
			
			
		System.out.println("*** 정보 입력 완료 ***\n");
		}//입력 반복문 끝.


		for(Score se : score) { //배열을 처음부터 끝까지 순열해야함
			//null.ScoreInfo()값이 전달되기 때문에 
			// 에러남 그래서 break해야 함.
			if(se == null) break;
			se.ScoreInfo();
			System.out.println("===========================");
			
		}
		sc.close();
		


	}
}
