package _02_accessModifier;

public class T01_main_accessModifier {

	public static void main(String[] args) {
		T01_api_accessModifier a1 = new T01_api_accessModifier();
		
		a1.setPriNum(10);
		System.out.println(a1.getPriNum());
		int num = a1.getPriNum();

	}

}
