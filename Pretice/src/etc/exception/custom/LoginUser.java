package etc.exception.custom;

import javax.security.auth.login.LoginException;

public class LoginUser {
	String userAccount;
	String userPassword;
	
	
	//지정되었던 계정 
	public LoginUser(String userAccount, String userPassword) {
		super();
		this.userAccount = userAccount;
		this.userPassword = userPassword;
	}
	
	//로그인 검증 메서드
	public String loginValidate(String inputAccount, String inputPassword) throws LoginValidateExample {
		if(userAccount.equals(inputAccount)) {
			if(userPassword.equals(inputPassword)) {
				return "SUCCESS";
			}else {
				throw new LoginValidateExample("비밀번호 똑바로!");
		}
		}else {
			throw new LoginValidateExample("회원가입부터 하세요!");
		}
		
	}
	

}
