package basic;

public class Pre14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
		 2. 각 과목의 평균을 출력해 보세요.
		 3. 반 평균을 출력해 보세요. (모든 학생들의 평균의 평균)
		 */
		
		int[][] score = {
				{79, 80, 99}, //A학생 0,1
				{95, 85, 89}, //B학생 1,1 
				{90, 65, 56}, //C학생 2, 1
				{69, 78, 77} //D학생  3,1
				//과목: 3과목
		};
		String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
		String[] subName = {"국어", "영어", "수학"};
		//1
		double total2 = 0.0;
		int idx =0;
		for(int[]s : score) {
			//배열하나하나를 가져옴
			int total = 0;
			for(int n : s) {
				//배열 하나 속에 값들을 가져옴
				total += n; //각 배열의 합들
				
			}
			double avg = (double)total / subName.length;
			total2 += avg; //각 평균들의 합
			//total과 subName은 int와 String타입이기에 double타입으로..
			System.out.printf("%s의 평균: %.1f점 \n", stuName[idx], avg);
			idx++; // 0,1,2 등으로 증가하며 배열의 값을 차례대로 불러온다. 
		}
		System.out.println("====================");
		// 2. 각 과목의 평균을 출력해 보세요.
		
		
		for (int i =0; i<3; i++) {
			int total =0;
			for(int j =0; j<4; j++) {
				total += score[j][i]; //각 과목의 합
			}
			double avg = (double)total / stuName.length;
			System.out.printf("%s의 평균: %.1f점 \n" ,subName[i], avg);
		}
		System.out.println("====================");
		
		
		//3. 반 평균을 출력해 보세요. (모든 학생들의 평균의 평균)
		double classAvg = total2 / stuName.length;
		System.out.printf("반 평균 : %.1f점", classAvg);
	}

}
