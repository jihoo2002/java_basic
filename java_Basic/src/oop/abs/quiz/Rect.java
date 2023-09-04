package oop.abs.quiz;

public class Rect extends shape {

	
private int side;
private int width;
private int height;
	
	public Rect(String name, int side) {
		super(name);  // 객체 변수를 받을 수 있는 생성자 
		this.side = side; //정사각형의 경우
	
	}
	public Rect(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height; //직사각형의 경우
	}

	@Override
	public double getArea() { //강제 오버라이딩
		if(side != 0) {
			return side * side;
		}else { //사이드가 0이라면 
			//main에서 사이드 값이 정해지지 않으면 사이드가 0이라서..?
			return width * height;
		}
		
	}
	
	
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}
