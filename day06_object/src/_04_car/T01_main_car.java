package _04_car;

public class T01_main_car {

	public static void main(String[] args) {
		/*속성 : 회사
		 *      모델
		 *      컬러(중간에 한번 바꾸기
		 *      스피드
		 *      시동
		 * 메소드:시동 켜고 끄기
		 *       스피드 올리기(10씩증가)
		 *       스피드 내리기(10씩 감소) 
		 */
		T01_api_car car1 = new T01_api_car();
		System.out.println("회사명 : " + car1.company);
		System.out.println("모델명 : " + car1.model);
		System.out.println("컬러 : " +car1.color);
		car1.color = "녹색";
		System.out.println(car1.color + "으로 변경");
		car1.power();
		System.out.println("스피드" + car1.speedUp() + "증가");
		System.out.println("스피드" + car1.speedDown() + "감소");
		car1.power();

	}

}
