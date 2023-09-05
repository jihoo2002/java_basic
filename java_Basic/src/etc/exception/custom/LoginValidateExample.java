package etc.exception.custom;

public class LoginValidateExample extends Exception{
	//부모 예외를 상속받는 자식 예외를 만듬
	
	//기본생성자
	public LoginValidateExample() {
		
	}
	
	//커스텀 에러 메서지를 받는 생성자.
	public LoginValidateExample(String message) {
		super(message); //exception이 예외를 받아야 하니까>>>????
		//super가 왜 매개변수 message를 받지??
		
	
	}
	
	
}
