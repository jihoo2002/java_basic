package oop.abs.bad;

public class MainClass {

	public static void main(String[] args) {
		
		HeadStore store = new SeoulStore();
		store.orderApple();
		store.orderBanana();
		store.orderGrape(); //부모 타입의 자식 객체

	}

}
