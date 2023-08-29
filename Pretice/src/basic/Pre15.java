package basic;

public class Pre15 {
	static int calcTotal(int x) {
		int total =0;
		for(int i =0; i<=x; i++) {
			total += i;
		}
		return total;
	}
	
	static int calRangeTotal(int start, int end) {
		int total =0;
		for(int i = start; i<=end; i++) {
			total +=i;
		}
		return total;
	}
	
	static String selectRangeFood() {
		double rn = Math.random();
		if(rn > 0.66) {
			return "치킨";
		}else if(rn >0.33) {
			return "족발";
		}else {
			return "삼겹살";
		}
	}
	static int calcNumberTotal(int[] nums) {
		int total = 0;
		for (int n : nums) {
			total += n;
		}
		return total;
	}
	static int calcNumberTotal2(int... nums) {
		int total = 0;
		for(int i : nums) {
			total += i;
		}
		return total;
	}
	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int[] operateTotal(int n1, int n2) {
		return new int[] {n1 + n2, n1-n2, n1*n2, n1/n2 };
	}
	
	static void multi(int n1, int n2) {
		int result = n1 *n2;
		System.out.printf("%d x %d = %d\n", n1, n2,result);
	}
	
	
	//////////////////////////////////////////////////
	
	static void divide(int n1, int n2) {
		if(n2 ==0) {
			System.out.println("0으로 나누지 마세요!");
			return; //탈출 !
		}
		int result = n1/n2;
		System.out.printf("%d / %d = %d\n", n1, n2, result);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = calcTotal(20);
		System.out.println(result);
		
		int result2 =calRangeTotal(3,7);
		System.out.println(result2);
		
		
		System.out.println("오늘 머먹지??" +selectRangeFood());
		
		int[] arr = {10,30,50,70,90,110};
		int sum = calcNumberTotal(arr);
		System.out.println("누적합: " +sum);
		
		sum = calcNumberTotal2(1,2,3,4,5,6,7);
		System.out.println("누적합: " +sum);
		
		int r1 = add(3,8);
		int r2 = add(10,15);
		int r3 = add(add(4,6), add(7, 8));
		
		
		int[] array1 = operateTotal(30, 6); //배열은 배열로 !
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		
		System.out.println("=======================");
		
		multi(20, 0);
		multi(add(3,4), add(4,7));
		
		divide(20, 10);
	}

}
