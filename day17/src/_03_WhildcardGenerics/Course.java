package _03_WhildcardGenerics;

public class Course {
	//모든 사람이 등록 가능
	static void registerCourse(Applicent<?>a) {
		System.out.println(a.kind.getClass().getSimpleName() + "가 couse에 등록함");
	}
	
	//학생만 등록 가능
	static void registerCourse2(Applicent<? extends Student> a) {
		System.out.println(a.kind.getClass().getSimpleName() + "가 couse2에 등록함");
	}
	
	//직장인 일반인 등록 가능
	static void registerCourse3(Applicent<? super Worker> a ) {
		System.out.println(a.kind.getClass().getSimpleName() + "가 couse3에 등록함");
	}

}
