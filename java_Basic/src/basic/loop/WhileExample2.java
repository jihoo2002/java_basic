package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		
//		int i = 48;
//		while(i <=150) {
//			
//			if(i%8==0) {
//			System.out.print(   i + " ");
//			}
//			i++;
//		}
//		//while만 쓰는 방법
////		int n = 48;
////		while(n<= 150) {
////			System.out.print(n + " ");
////			n += 8;
////		}
//	System.out.println();
//
//	//1~100까지 정수 , 4의 배수이면서 8의 배수아닌 수
//	int n = 1;
//	while(n <=100 ) {
//		if(n %4 ==0 && n%8 !=0) {
//			System.out.print(n + " ");
//		}
////		if(i%4 ==0) {
////			if(i%8 !=0) {
////				System.out.println(i + "");
////			}
////		}
//		n++;
//	}
//	System.out.println("============");
//	//1~30000
//	int j = 1;
//	int count =0;
//	while(j <=30000) {
//		if(j%258==0) {
//			count++;
//		}
//		j++;
//	}
//	System.out.println();
		
//1000의 약수 개수
		int i = 1;
		int count =0;
		while (i <=1000) {
		if(1000%i==0) {
			count++;
		}
		i++;
	
	}
	System.out.println("약수의 개수: " + count);
	}
}
