package oop.constructor;

import java.util.Scanner;

public class Person {
	String name;
	int age;
	int k;

	Person() {
		//기본 생성자 하나 정도는 만들어야 편함
	}
	
	Person(String pName, int pAge, int pK) {
		name = pName;
		age = pAge;
		k = pK;
	}
	void info() {
	System.out.println("이름: " + name);
	System.out.println("나이: " + age);
	System.out.println("키: " + k);
	
}
}
