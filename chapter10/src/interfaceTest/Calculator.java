package interfaceTest;

//Calc 인터페이스를 상속 받을 때 키워드 implements
public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		
		return num1 * num2;
	}

	@Override
	public int substract(int num1, int num2) {
		
		return 0;
	}

	@Override
	public int times(int num1, int num2) {
		
		return 0;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1/num2;
		}
		return error;
	}
	//출력 메소드 생성
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하겠습니다.");
	}
}
