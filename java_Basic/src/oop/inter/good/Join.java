package oop.inter.good;

public class Join implements IUserService {

	@Override //오버라이드 재정의 
	public void execute() {
		System.out.println("회원 가입 로직이 실행됩니다.");
		System.out.println("DB접속도 하고, 입력값도 가져오고, 값을 집어 넣고 등등등..");

	}

}
