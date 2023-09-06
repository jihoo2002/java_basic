package etc.exception.custom;

public class MainClass {

	public static void main(String[] args) {
		
		LoginUser user = new LoginUser("abc1234", "aaa1111");
		
		String result;
		try {
		result =user.loginValidate("abc1234", "aaa1112");
		System.out.println(result);
		
		} catch (LoginValidateExample e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
