package oop.obj_arr;

public class Person {
	/*
    - alt + shift + s -> generate getters and setters
    - alt + shift + s -> generate constructor using fields
     생성자 자동으로 만들어줌*/
	
	private String name; //기능들 은닉함
	private int age;
	private String gender;
	
	
	public Person() {} //기본 생성자
	
	
	
	
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


//무조건 set, get 같이 있을 필요는 없다. 


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public void personInfo() {
		System.out.printf("이름: %s\n 나이: %d세\n 성별: %s\n",
				this.name, this.age, this.gender);
	}

}
