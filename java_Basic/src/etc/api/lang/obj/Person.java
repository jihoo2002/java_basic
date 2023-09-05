package etc.api.lang.obj;

import java.util.Objects;

public class Person implements Cloneable {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	

	@Override 
	//tosting오버라이딩 해서 값 넣어주면 personInfo()와 같은 메소드를 만들필요가 없다.
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	//Person객체의 이름와 나이를 비교해주는 메서드로 override
	public boolean equals(Object obj) { //obj는 모든 객체타입을 가질 수 있기에
		if(this == obj) return true;
		if(obj instanceof Person) { 
			Person p = (Person) obj; //object타입을 Person 타입으로 형변환 -> name과 age를 확인 가능.
			if(this.name.equals(p.name)&&this.age == p.age) {
				return true;
			}
		}
		return false;
	}
	
	//equals를 오버라이딩 할 때는 hashCode도 함께 오버라이딩을 진행해주시는 것이 좋다
	//equals를 재정의 한다는 것은 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문에
	// hashcode의 값도 그에 맞게 같이 재정의가 되어야 한다(hash 주소를 equals에 맞게 정의)
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동으로 호출(gc<가비지 컬렉터>가 실행될때)
		System.out.println(this.name + "이(가) 주것습니당..");
	}
	
	//객체 복사 메서드
	//Cloneable 인터페이슬 구현해서 사용해야 합니다. 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


//	public void personInfo() { 
//		System.out.println("이름: " + name );
//		System.out.println("나이: " + age + "세");
//	}

}
