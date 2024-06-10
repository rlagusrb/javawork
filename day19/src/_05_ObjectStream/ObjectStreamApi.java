package _05_ObjectStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamApi {
	//ObjectOutputStream 보조 스트림 사용
	//출력 메소드 : writeObject(객체);
	//입력 메소드: readObject()
	
	//객체를 파일로 출력
	void fileSave() {
		Phone p1 = new Phone("객럭시", 2000000);
		Phone p2 = new Phone("아이폰", 1800000);
		Phone p3 = new Phone("샤오밍", 900000);
		
		//기반스트림 : FileOutputStream(1byte단위로 출력할 수 있는 스트림)
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file_object.txt"))){
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file_object.txt"))) {
			System.out.print(ois.readObject());
			System.out.print(ois.readObject());
			System.out.print(ois.readObject());
			System.out.print(ois.readObject());
			
			while(true) {
				System.out.println(ois.readObject());
			}
		}catch(EOFException e) {
			System.out.println("파일을 모두 읽었습니다");
		}catch(Exception e) {
			e.printStackTrace();
	}

}
}
