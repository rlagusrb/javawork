package _04_consumer;

import java.util.function.*;

public class T01_consumer {

	public static void main(String[] args) {
		// Consumer interface : 리턴값없음
		//1. 매개변수1개 모든 객체
		Consumer<String> consumer = x -> System.out.println(x);
		consumer.accept("java");
		
		// 2. 매개변수 2개 : 앞에 Bi라는 접두어 붙임
		BiConsumer<String, String> biCon = (a,b) -> System.out.println(a+", " + b);
		biCon.accept("더조은", "의료형 AI");
		
		//3.매개변수 1개의 double형 
		DoubleConsumer douCon = d -> System.out.println(d);
		douCon.accept(3.14);
		
		//4. 매개변수 2개중 1개는 모든 객체, 1개는 int형
		ObjIntConsumer<String> oiCon = (o, i) -> System.out.println(o+", " + i);
		oiCon.accept("Program" , 2);

	}

}
