package _02_exception;

public class T03_NullPointer {

	public static void main(String[] args) {
		//String data = null;
		//System.out.println(data.toString());
		
		try {
			String data = null;
			System.out.println(data.toString());
			
		}catch(NullPointerException e) {
			String data = null;
			System.out.println("메시지 : " + e );
		}

	}

}
