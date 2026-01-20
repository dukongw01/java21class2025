package abstractTest;

class definal{
	public static final int min = 1;
	public static final int max = 999;
	public static final int eng = 101;
	public static final int math = 201;
	public static final double pi = 3.14;
	public static final String good_moning = "good moning";
}

public class FinalTest {

	public static void main(String[] args) {
		//final예약어
		//final 변수는 값이 변경될 수 없는 상수이다
		//예) public static final double pi = 3.14
		//재할당할 수 없다. pi = 3.0(X)
		//final 메서드는 하위 클래스에 재정의 할 수 없다
		//final 클래스는 상속되지 않는다
		//final 선언과 동시에 할당하거나 또는 생성자에서 한번만 할당
		
		// static 키워드로 작성도니 변수는 인스턴스하지 않아도 접근 가능하다
		System.out.println(definal.good_moning);
		System.out.println("영어과목 코드" + definal.eng);
		System.out.println("수학과목 코드" + definal.math);
		
		//define.pi = 3.1; //final 재할당 안됨
		double num = define.pi * 1000;

	}

}
