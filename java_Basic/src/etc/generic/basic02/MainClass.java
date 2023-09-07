package etc.generic.basic02;

public class MainClass {

	public static void main(String[] args) {
		
	Box<Integer, String> b = new Box<>(1, "홍길동");
		///이 값은 왜 집합 안에 안넣어져있찌????
	String name =b.get(1);
	
	b.put(10, "김메롱");
	System.out.println(b);
	
	
	
	}

}
