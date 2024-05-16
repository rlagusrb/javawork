package _03_overloading;

class ThisAaa {
	int num;
	double dou;
	String name;
	//생성자에게 this():다른 생성자 호출
	// this()는 맨 첫줄에 있어야 됨
	
	ThisAaa() {
		this(1, 1.0, "홍길동");
		num = 1;
		dou = 1.0;
		name = "홍길동";
		System.out.println("매체변수가 없는 생성자");
	}
	ThisAaa(int num, double dou) {
		this(1, 1.0, "홍길동");
		System.out.println("매가 변수가 2개인 생성자(int,double)");
	}
	ThisAaa(int num, String name) {
		this.num = num;
		dou = 1.0;
		name = "홍길동";
		System.out.println("매개변수가 2개인 생성자(int, String");
	}
	ThisAaa(int num, double dou, String name) {
		this.num = num;
		dou = 1.0;
		name = "홍길동";
		System.out.println("매채변수가 3개인 생성자");
	}
	//가변인자 : 들어올 인자의 갯수를 모를때
	//(int...str): 인자는 0개 이상

}
public class T03_main_ThisConOverloading {

	public static void main(String[] args) {
	ThisAaa a1 = new ThisAaa();
	ThisAaa a2 = new ThisAaa(5, 10.56, "나야나");
	ThisAaa a3 = new ThisAaa(10, 50.1234);
	//ThisAaa a4 = new ThisAaa(a1.num);


	}

}
