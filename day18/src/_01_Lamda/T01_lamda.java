/*package _01_Lamda;

public class T01_lamda {

	public static void main(String[] args) {
		// 람다식 사용할 때 사용하는 interface
		// 1. 추상메서드로 구현
		// 2. 추상메서드는 반드시 1개만 있어야 됨
		
		MyMethod mm1 = new MyMethod() {

			@Override
			public void method() {
				System.out.println("method() call");
			}

			@Override
			public int max(int x, int y) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		mm1 = () -> {
			System.out.println("람다에서 출력");
		};
		

	}

}*/
