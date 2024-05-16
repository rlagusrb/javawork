package _06_static;

public class T02_api_ex {
	int empNo = 100;
	String empName = "홍길동";
	String dept = "영업부";
	String job = "과장";
	int age = 25;
	String gender = "남";
	int salary = 25000000;
	double bonusPoint = 0.05;
	String phone = "010-1234-5678";
	String address = "서울시 강남구"; 
	
	T02_api_ex() {
	}
	T02_api_ex(String empName, String dept, String job) {
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		bonus();
	}
	void bonus() {
		bonusPoint = 0.1;
		System.out.println(salary*bonusPoint);
	}
			

}
