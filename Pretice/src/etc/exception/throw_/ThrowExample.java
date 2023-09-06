package etc.exception.throw_;

public class ThrowExample {
	
	
	static int calcTotal(int num) throws Exception{
		if(num <=0) {
			throw new Exception(); //인위적으로 예외를 발생
		}
		int total =0;
		for(int i =0; i<=num; i++) {
			total += i;
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println(calcTotal(100));
			System.out.println(calcTotal(-120));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("매개값은 양수로만!");
		}

	}

}
