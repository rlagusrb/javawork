package _05_polymorphism;
class Parent {
	void method1() {
		System.out.println("parent metod1()");
	}
	void method2() {
		System.out.println("parent method2()");
	}
}
class Child extends Parent {
	@Override
	void method2() {
		System.out.println("child method()");
	}
	void method3() {
		System.out.println("child method3()");
	}
}

public class T02_polyRun {

	public static void main(String[] args) {
		Parent parent2 = new Child();
		parent2.method1();
		// 오버라이딩한 메소드는 형변환과 상관없이 무조건 ㅇ오버라이딩한 메소드 호출
		parent2.method2();

	}

}
