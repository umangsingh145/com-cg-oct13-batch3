package Poly;

public class PolyDemo {
	public static void main(String[] args) {

		Calc calc = new Calc();
		System.out.println(calc.addNumbers(10, 20));
		System.out.println(calc.addNumbers(10, 20, 30));
		System.out.println(calc.addNumbers(10, 20, 30, 40));
		
		Child child = new Child();
		child.someMethod();
	} 

}
