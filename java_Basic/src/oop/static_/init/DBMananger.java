package oop.static_.init;

public class DBMananger {

	
	public static String addr;
	public static String uid;
	public static String upw;
	
	//정적 변수를 자동으로 초기화하려면 정적 초기화자가 필요
	static {
		System.out.println("정적초기화자가 호출됨!");
		addr = "192.168.0.2:8181/XEPDB1";
		uid = "abc1234";
		upw = "aaa1111";
	}//static의 생성자라고 생각하면 된다. 
	
	public DBMananger() {
		System.out.println("생성자가 호출됨!");
		addr = "192.168.0.2:8181/XEPDB1";
		uid = "abc1234";
		upw = "aaa1111";
	}
	
	
	
	
	
}
















