package _03_WhildcardGenerics;

public class T01_GenericsRun {

	public static void main(String[] args) {
		//모든사람 신청 가능
		Course.registerCourse(new Applicent<Person>(new Person()));
		Course.registerCourse(new Applicent<Worker>(new Worker()));
		Course.registerCourse(new Applicent<Student>(new Student()));
		Course.registerCourse(new Applicent<HighStudent>(new HighStudent()));
		Course.registerCourse(new Applicent<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		//학생만 신청 가능
		Course.registerCourse(new Applicent<Student>(new Student()));
		Course.registerCourse(new Applicent<HighStudent>(new HighStudent()));
		Course.registerCourse(new Applicent<MiddleStudent>(new MiddleStudent()));
		System.out.println("------------------------------------------------------------------------");
		
		//직장인과 일반인만 신청 가능
		Course.registerCourse3(new Applicent<Person>(new Person()));
		Course.registerCourse3(new Applicent<Worker>(new Worker())); //

	}

}
