package oop.encap.good;

public class Main {

	public static void main(String[] args) {
	
		MyBirth my = new MyBirth();
//		my.year = 1000000; private 이라 접근이 안됨
		
		
		my.setYear(2002);
		my.setMonth(5);
		my.setDay(29);
		
		my.birthInfo();
	
		
		
		
	

	}

}
