package oop.encap.good;

public class MyBirth {
	
	/*
	 * 정보 은닉: 데이터 보호의 목적으로 사용하는 
	 * oop(객체지향프로그래밍) 기술 중 하나
	 * 
	 * - 외부에서 직접 변수에 접근할 수 없도록 멤버변수에 private 제한을 붙임.
	 */
	
	private int year;
	private int month;
	private int day;
	
	
	
	/*
	 * - 정보 은닉은 데이터에 접근 제한을 걸어서 정보를 보호하는 게 목적이지만
	 * private를 설정했더니 데이터 접근 자체가 불가능해집니다.  
	 
	 * 따라서 데이터의 유효성을 검증할 수 있는 제어문이 포함된
	 * 메서드를 사용하여 데이터의 접근을 허용하도록 설계하는데,
	 * 이 때 사용하는 메서드는 getter /setter 메서드라고 부릅니다. 
	 * 
	 
	  # setter method
     
     1. setter는 숨겨진 변수에 값을 저장하기 위한 메서드 입니다.
     
     2. 메서드 내부에 데이터 유효성 검증 로직을 작성하여
      적절한 데이터만 멤버변수에 저장시키고, 접근제한자는
      public으로 설정하여 외부에서 누구나 사용할 수 있게 합니다.
      
     3. 메서드 이름은 일반적으로 set + 멤버변수이름 으로 설정합니다.
	  
	 */
	
	public void setYear(int year) {
		if(year <1900 || year >2023) {
			System.out.println("잘못된 연도 입력입니다.");
		}else {
			this.year =year;
		}
	}
	
	/*
    # getter method
    
    1. getter는 숨겨진 변수의 값을 참조할 때 사용하는 메서드입니다.
    
    2. setter와 마찬가지로 public제한을 통해 외부에 메서드를 공개하고,
     이름은 일반적으로 get + 멤버변수이름 으로 지정합니다.
    */
	
	public int getYear() {
		return this.year;
	}
	
	public void setMonth(int month) {
		if(month <1 || month >12) {
			System.out.println("잘못된 월 입력입니다.");
		}else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return this.month;
	}
	
	
//	private void setd() {
//		// TODO Auto-generated method stub
//
//	} setd + ctrl + 스페이스, get도 마찬가지로 !
	
	
	public void setDay(int day) {
		if(day<1 || day>31) {
			System.out.println("잘못된 일 입력입니다.");
		}else {
			this.day = day;
		}
	}
	public int getDay() {
		return this.day;
	}
	
}
