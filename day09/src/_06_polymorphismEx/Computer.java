package _06_polymorphismEx;

public class Computer extends Product {
	
		Computer() {
			super(300);
		}
		@Override
		public String toString( ) {
			return "Computer";
		}

}

