package _05_polymorphism;
class A{}
class B extends A {int a=1;}
class C extends A {int b=2;}
class D extends B {int c=3;}
class E extends C {int d=4;}

public class T01_polyRun {
	public static void main(String[] args) {
		//자동 형변환 : 자식을 부모 타입으로 형변환
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		System.out.println(b.a);
		//System.out.println(b.b);
		
		//System.out.println(a1.a);
		//System.out.println(a1.b);  A클래스 타입을 형변환했기 때문에 A클래스만 사용할 수 있다.
		

	}

}
