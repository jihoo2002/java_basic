package quiz;

public class ex3 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			for(int j=0; j<10; j++) {
				int num = i+j;
				if(num >10) {
					num-= 10;
				}
				System.out.printf("%d" , num);
			}
			System.out.println();
		}

	}

}
