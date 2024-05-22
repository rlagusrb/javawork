package _05_interface;

public class Oracle implements DataAccess {

	@Override
	public void select() {
		System.out.println("오라클을 검색합니다");

	}

	@Override
	public void insert() {
		System.out.println("오라클을 삽입합니다");

	}

	@Override
	public void update() {
		System.out.println("오라클을 수정합니다");

	}

	@Override
	public void delete() {
		System.out.println("오라클을 삭제합니다");

	}

}
