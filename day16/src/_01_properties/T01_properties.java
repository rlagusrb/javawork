package _01_properties;

import java.util.Properties;

public class T01_properties {

	public static void main(String[] args) {
		// properties : Map계열 =>키+값 세트 저장
		// HashMap과의 차이 : Properties에는 키 = String, 값 =String으로 담는다
		Properties prop = new Properties();
		
		//값을 추가할 때
		//1.setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("set", "ArrayList");
		prop.setProperty("Map", "ArrayList");
		prop.setProperty("Map", "ArrayList");
		System.out.println(prop);
		
		//key를 얻어올때
		//2. getProperty(String key)
		System.out.println(prop.getProperty("set"));
		System.out.println(prop.getProperty("AAA")); // 키가 존재하지 않으면 null
		
		try {
		//prop.store((new FileOutputStream("test.properties"), "properties");
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
