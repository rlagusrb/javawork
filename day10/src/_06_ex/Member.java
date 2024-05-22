package _06_ex;

public class Member {
	private  String name;
	private  int age;
	private String gender;
	Member(){}
	Member(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	void setGender(String gender) {
		this.gender = gender;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "이름 :" + name + "나이" + age + "성별" + gender;
	}

}
