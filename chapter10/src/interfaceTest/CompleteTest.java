package interfaceTest;

public class CompleteTest {

	public static void main(String[] args) {

		//인터페이스는 인스턴스화 할 수 없다. 단, 업캐스팅은 할 수 있다.
		int num1 = 10;
		int num2 = 2;
		Calc calc = new CompleteClac();
		System.out.println(calc.add(num1,num2));
		System.out.println(calc.substract(num1,num2));
		System.out.println(calc.times(num1,num2));
		System.out.println(calc.divide(num1,num2));
		
		CompleteClac comp = new CompleteClac();
		comp.showInfo();
		
		calc.description();
		int[] arr = {1,2,3,4,5};
		int sum ;
		
	}

}
