package etc.generic.basic;

public class Box<T> { //제네릭 클래스로 선언 
	
	private T obj; //필드변수 생성
	
	public T getObj() { //get 과 set 생상
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
}
