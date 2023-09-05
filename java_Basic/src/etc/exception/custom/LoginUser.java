package etc.exception.custom;

public class LoginUser  {
	
	String userAccount;  //계정명
	String userPassword; //가입시 설정한 패스워드
	
	
	//객체가 생성될 떄 계정과 패스워드가 지정됨. 즉 생성자!
	public LoginUser(String userAccount, String userPassword)  {
		super(); //자동완성 땜시 생김
		this.userAccount = userAccount;
		this.userPassword = userPassword;
	}
	
	//로그인 검증
	public String loginValidate(String inputAccount, String inputPassword)throws LoginValidateExample {
		// 계정명이 일치하는가?
		if(userAccount.equals(inputAccount)) {
			//패스워드가 일치하는가?
			if(userPassword.equals(inputPassword)) {
				//로그인 성공
				return "SUCCESS";
			}else {
				//패스워드가 틀림
				throw new LoginValidateExample("비밀번호 똑바로 치세요!");
			}
		}else {
			throw new LoginValidateExample("회원가입부터 하세요!");
			//계정 정보가 틀림
			
		}
	}
}
