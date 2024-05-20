package _01_phone;

public class PhoneRun {

	public static void main(String[] args) {
		SmartPhone sPhone = new SmartPhone("note20" , "white");
		System.out.println("model명 : " + sPhone.model);
		System.out.println("색상 :" + sPhone.color);
		
		sPhone.ball();
		sPhone.hangUp();
		sPhone.receveVoice("안녕하세요 홍길도 입니다.");
		sPhone.sendVoice("네 반가워요.");
		sPhone.hangOut();
		sPhone.search("java");
		
		Phone phone1 = new Phone("aplle3", "black");
		phone1.ball();
		phone1.hangOut();
		// phone.search(); 사용 못함
		

	}

}
