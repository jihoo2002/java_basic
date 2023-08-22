package basic;

public class pretice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples =123; //사과 개수
		int sizeOfBucket = 10;//바구니에 담을 수 있는 사과 개수
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket>0? 1:0) ;
		System.out.println("필요한 바구니 개수 :" + numOfBucket);
		//123을 10으로 나눈 값은 12 +
		//나머지 값이 3개가 0보다 크면 바구니 하나가 더 들어가는 삼항 연산자 사용
		
	}

}
