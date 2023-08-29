package oop.constructor;

public class PhoneMain {

	public static void main(String[] args) {
		
		phone basic =new phone(); //생성자 호출문
//		basic.color = "회색";
//		basic.model ="폴더폰";
//		basic.price = 200000;
		
		basic.showSpec(); //기능
		
		System.out.println("====================");
		
		phone galaxy = new phone("갤럭시 23"); //phone(String pModel )의 매개변수로 전달
		galaxy.showSpec();
		
		System.out.println("====================");
		phone iphone14 = new phone("아이폰 14", "스페이스 그레이");
		iphone14.showSpec();
		
		
		
		

	}

}
