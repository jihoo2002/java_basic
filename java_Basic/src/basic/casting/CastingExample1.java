package basic.casting;

public class CastingExample1 {

	public static void main(String[] args) {
		/*
		 * 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환
		 * 할 때는 자바 가상 머신(JVM)이 자동으로 타입을 올려서 
		 * 변화해준다. (promotion, upcasting)
		 */
		//업캐스팅 !
		byte b = 10;
		int i = b; //byte이 int로 변환된 후 대입 연산 진행
		System.out.println(i);
		
		
		char c = 'A';
		int j = c;
		System.out.println("A의 유니코드: " + j);
		
		int k = 500;
		double d = k;
		System.out.println(d);
	}

}
