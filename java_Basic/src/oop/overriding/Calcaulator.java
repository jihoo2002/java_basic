package oop.overriding;

public class Calcaulator {
	/*
    # 오버로딩 (중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
     생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법.
     
    - 오버로딩 적용 조건:
    1. 매개 변수의 데이터 타입이 다를 것! or
    2. 매개 변수의 전달 순서가 다를 것! or
    3. 매개 변수의 개수가 다를 것.
    */
	
	void inputData() {}
	
	void inputData(int a) {}
	
	void inputData(int a , int b) {}
	
	// void inputData(int b,int a) {} (x)
	
	void inputData(String a) {}
	
	void inputData(int a, double d) {}
	
	void inputData(double d, int a) {}
	
//	void inputData(int number) {} (x) 정수 매개값 1개 받는 메서드가 이미 선언되어있음
	
//	int inputData(int number) {
//		return 0; //리턴타입이 다르다고 중복선언을 허용하지 않는다.
//	}
//	(x)반환 유형(return type)은 오버로딩에 영향을 미치지 못합니다. 
	
	
	
	/*
    - Calculator 클래스에 calcRectArea() 메서드를 선언하여
    
    
    
    1. 길이를 하나만 전달하면 정사각형의 넓이를 리턴.
    2. 길이를 두 개 전달하면 (가로, 세로) 직사각형의 넓이를 리턴.
    3. 길이를 세 개 전달하면 (밑변, 윗변, 높이) 사다리꼴의 넓이를 리턴.
    
    MainClass에서 객체를 생성한 후 직접 메서드를 호출해서 출력해 보세요.
    (길이가 5인 정사각형의 넓이, 가로10 세로20인 직사각형의 넓이
    윗변 5 밑변 13 높이 7인 사다리꼴의 넓이) 
    */
	
	
	int calcRectArea(int x) {
		return x*x; //Math.pow(2,8) ->2의 8제곱
	}
	int calcRectArea(int x, int y) {
		return x*y;
	}
	
	double calcRectArea(int x, int y, int z) {
		return (x+y)/2.0*z; //소수점이 발생할 가능성을 대비해서 2.0으로 입력하고 double로 타입 정함
	}
}
