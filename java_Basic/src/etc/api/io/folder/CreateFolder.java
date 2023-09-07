package etc.api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		/*
		 -자바에서 외부 경로로 폴더를 생성할 때는 file 클래스를 사용
		 생성자의 매개값으로 폴더를 생성할 경로 + 폴더명을 지정합니다. 
		 */
		
		File file = new File("C:/Mywork/folder_test/test/mytest/apple"); 
		//기본생성자 자체가 없음
		
		if(!file.exists()) { //해당 파일 및 폴더가 존재하면 true, 존재하지 않다면 false
			//파일경로가 존재하지 않니?
//			file.mkdir(); //경로를 만들어라 (복수의 폴더를 만들때는 동작하지 않음)		
				// 만들고자 하는 경로의 상위 디렉토리가 존재하지 않는다면 동작 안함.		
			file.mkdirs(); //폴더 생성 -> 전부 다 생성해줌 !!!!!
			System.out.println("폴더생성 완료!");
		}else {
			System.out.println("해당 폴더가 존재합니다.");
			
		}
	}

}
