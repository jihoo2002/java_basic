package etc.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutPutStreamEx {

	public static void main(String[] args) {
		
		/*
        1. 파일을 쓸 때 (작성) 사용하는 클래스는 FileOutputStream 입니다.
        2. 생성자의 매개값으로 파일을 쓸 전체 경로를 지정합니다.
        3. io패키지의 모든 클래스들은 생성자에 throws 키워드가 있기 때문에
        try-catch 블록을 항상 작성해야 합니다.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명: ");
		String fileName = sc.next();
		
		
		FileOutputStream fos = null; //finally에서 fos를 쓰기 위해서 미리 선언
		try {
			fos = new FileOutputStream("C:/Mywork/" + fileName + ".txt");
			//fos는 스트림 객체라 끝나면 닫아줘야 함 아니면 메모리 소모가 있음
			System.out.print("문장을 입력하세요: ");
			sc.nextLine();//파일명 입력후 엔터 입력값 처리
			String str = sc.nextLine(); 
			//nextLine은 공백도 가져가기에 파일명을 쓰고 엔터를 누르면 그 엔터값을
			//문장을 입력하세요 라는 값 안에 넣기 때문에 파일이 저장된다. 
			//그래서 sc.nextLine()을 한번 더 배치 시켜야 다음 절차로 넘어간다. 
			
			
			
			
			byte[] arr = str.getBytes(); //str을 바이트 배열로 변환
			//문자열 데이터를 바이트 데이터로 변환
			
			//그 다움 파일을 바이트 탄위로 써줌
			fos.write(arr); //다중 캐치 문 작성
			System.out.println("파일이 정상적으로 저장되었습니다.");
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//스트림을 더이상 사용하지 않는 경우 시스템 자원을 반납하는 코드를 꼭 작성 !
			try { //close도 throw가 불어있음(객체 생성 안되었을 떄 오류가 날 가능성이 있기 때문에)
				fos.close(); 
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
