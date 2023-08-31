package oop.obj_arr;

import java.util.Scanner;

public class ArrayInsert {

	
	
	public static void main(String[] args) {
		
		
		/*
        - 스캐너를 이용하여 Person객체를 생성하는 데 필요한
         정보를 입력받으시면 되겠습니다.
         입력받은 정보를 토대로 Person객체를 생성한 후
         여러 개의 Person 객체를 배열에다 담아 둘 생각입니다.
         
        - 배열의 크기는 3개로 하겠습니다. 반복문을 이용하여
         입력을 반복해서 받아주시면 됩니다.
         
        - 입력이 끝나면 배열 안에 있는 모든 주소값을 순회하여
         각 객체의 personInfo()를 호출해 보세요. 
        */
		
		
		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[3]; //3개짜리 배열 
		
		for(int i =0; i<people.length; i++) {
			people[i] = new Person(); //객체를 배열 안에 집어넣기
			
			System.out.println("이름을 입력해주세요: ");
//			String name = sc.next();
			people[i].setName(sc.next());
			
			System.out.println("나이를 입력해주세요: ");
//			int age = sc.nextInt();
			people[i].setAge(sc.nextInt());
			
			System.out.println("성별을 입력해주세요: ");
//			String gender = sc.next();
			people[i].setGender(sc.next());
			//private로 선언된 name, age, gender이기에
			//set을 써서 불러올 수 도 있다.
			//get을 안쓰고 personInfo를 통해 값을 불러올수 있었기 때문에
			//get은 굳이 쓰지 않았음
			
			
//			Person p = new Person(name, age, gender);
			//people[i] =p;
			//42,43 합쳐서 작성한게 45번임
//			people[i] = new Person(name, age, gender);
			System.out.println("***정보 입력 완료 ***\n");
		}//입력받는 반복문 끝
		
		for(Person p : people) {
			p.personInfo();
		}
		
		
	}

}
