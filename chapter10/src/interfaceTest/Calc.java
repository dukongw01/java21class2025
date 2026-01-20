package interfaceTest;

public interface Calc {
	//java 7버전 이전에는 구현코드가 있는 메서드가 존재할 수 없었다
	//java 8버전 이후에는 구현코드가 있는 메서드가 존재함을 주의하자
	//인스페이스에서 멤버 변수는 public static final인 상수로 지정
	
	public static final double pi = 3.14;
	//인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	int error = -9999;
	//인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	//인터페이스에서 구현체가 존재하지 않는 메서드는
	//abstract 키워드를 작성하든 안하든 무조건 추상 메서드이다.
	public abstract int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// --- Java 버전 8 이후 ----------
	//디폴트 메서드 : 기본 구현을 가지는 메서드로 구현 코드를 재정의 할 수 있다
		default void description() {
			System.out.println("점수 계산을 구현하시오");
		}
		
		//정적 메소드 : 인스턴스 생성과 상관없이 인터페이스 타입으로 사용가능
		static int total(int[] arr) {
			int total = 0;
			for(int i=0; i<arr.length; i++) {
				total += arr[i];
			}
			myStaticMethod();
			return total;
		}
		//private 메서드 : 인터페이스 내부에서만 사용가능 구견한 클래스에서 사용하거나 재정의 불가능
		private void myMethod() {
			System.out.println("private 메서드");
		}
		//private static 메서드
		private static void myStaticMethod() {
			System.out.println("private static 메서드");
		}
	
}
