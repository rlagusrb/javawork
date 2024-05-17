package _05_product;

public class T01_main_product {


	public static void main(String[] args) {
		T01_api_product p1 = new T01_api_product();
		T01_api_product p2 = new T01_api_product();
		T01_api_product p3 = new T01_api_product();
		
		System.out.println("p1의 제품번호 : "+ p1.serialNo);
		System.out.println("p2의 제품번호 : "+ p2.serialNo);
		System.out.println("p3의 제품번호 : "+ p3.serialNo);
		System.out.println("생산된 제품의 총 갯수 : "+ T01_api_product.count);
		

	}

}
