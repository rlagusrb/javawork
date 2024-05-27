package _01_langPackage;

import java.util.Arrays;

public class T05_cloneShallowDeepCopy {
	class Point implements Cloneable {
		int x;
		int y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		@Override
		public String toString() {
			return "x=" + x + ", y=" + y; 
		}
}
class Circle implements Cloneable {
	Point p;  //중심점
	double r; //반지름
	
	Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}
	
	//인스턴스변수가 기본자료형이면 깊은복사
	//인스턴스변수가 참조자료형이면 앞은복사(즉, 주소만 복사)
	@Override
	public Object clone() {
		Object obj = null;
		try {
			super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		Circle c = (Circle)obj;
		c.p = new Point(this.p.x, this.p.y);
		return obj;
	}
}



	public static void main(String[] args) {
		// 얕은복사
		String[] str = {"a", "b", "c"};
		String[] copyStr = str;
		
		str[0] = "d";
		System.out.println(str[0]);
		System.out.println(copyStr[0]);
		System.out.println("--------------------------------");
		
		String[] deepCopy = new String[5];
		for(int i=0; i<str.length; i++) {
			deepCopy[i] = str[i];
		}
		System.out.println(Arrays.toString(deepCopy));
		System.out.println("--------------------------------");
		str[0] = "a";
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(deepCopy));
		System.out.println("--------------------------------");
		//2. Array.copyOf(원본배열, 복사할 길이)
		String[] arrayCopy = Arrays.copyOf(str, str.length);
		System.out.println(Arrays.toString(arrayCopy));
		System.out.println("--------------------------------");
		arrayCopy[2] = "z";
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(arrayCopy));
		System.out.println("--------------------------------");
		
		//3.clone()
		//Circle c1 = new Circle(new Point(5,10),3);
		
		//배열에서의 clone
		int[] num = {1,2,3};
		int[] numClone = num.clone();
		
		numClone[0] = 100;
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(numClone));
		
		
		

	}
}

