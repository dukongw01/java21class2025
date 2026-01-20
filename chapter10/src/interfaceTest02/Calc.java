package interfaceTest02;

public interface Calc {
	
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
