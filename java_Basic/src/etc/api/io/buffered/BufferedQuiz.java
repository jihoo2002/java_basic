package etc.api.io.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class BufferedQuiz {
	
	static class LocalDate {
		
	
	
	}
	public static void main(String[] args) {
		
		File file = new File("C:/Mywork/20230908file");
		if(!file.exists()) {
			file.mkdir();
			System.out.println("폴더 생성완료");
		}else {
			System.out.println("해당 폴더 존재");
		}
	
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("파일명을 입력하시오 (확장자까지 작성하세요):");
		String name = sc.next();
		
//		File file = new File("C:/Mywork/20230908file/ " +name);
		
		FileWriter fw = null;
		BufferedWriter bw= null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fw = new FileWriter("C:/Mywork/20230908file/" + name );
			bw = new BufferedWriter(fw);
			
			
			while(true) {
			System.out.println("문장을 입력하세요:");
			sc.nextLine();
			String str = sc.nextLine();
			
			bw.write(str + "\r\n" );
			
			
			
			if(str.equals("그만")) {
				System.out.println("입력을 중단합니다.");
				break;
		
			}
			}
			fis = new FileInputStream("C:/Mywork/20230908file/" + name);
			bis = new BufferedInputStream(fis);
			
			int b;
			while((b = bis.read())!= -1) {
				System.out.println((char)b);
			}
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				fis.close();
				bw.close();
				fw.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
		
		
	}
}

