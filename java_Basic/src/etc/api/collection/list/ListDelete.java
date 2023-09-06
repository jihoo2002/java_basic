package etc.api.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<String> kakao = new ArrayList<>();
		Collections.addAll(kakao, "무지", "네오" , "어피치", "라이언" , "제이지", "춘식이");
		System.out.println("현재 저장된 친구들 : " + kakao);
		System.out.println("삭제할 친구를 입력하세요: ");
		String name = sc.next();
		/*
		 * 입력받은 이름 리스트내에서 삭제, 없으면 없는 이름이라 출력
		 */
		
		//nick.contains("메뚜기"));
		
		if(kakao.contains(name)) {
			kakao.remove(name);
			System.out.println(name +"이(가) 삭제되었습니다.");
			System.out.println(kakao);
		}else {
			System.out.println("없는 이름입니다. 다시 입력하세요");
		}
		sc.close();
	}

}
