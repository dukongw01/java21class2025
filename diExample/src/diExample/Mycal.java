package diExample;

public class Mycal {
	
	//메서드 하나로 덧뺄곱나 모두 실행되어야함
	public void cal(int num1, int num2, Ical ical) {
		int result = ical.doOper(num1, num2);
	    System.out.println("값 : " + result);
	}
	
	//Mycal 클래스의 메서드들을 모듈(부품)화 할 예정
	
	//1) 계산기 클래스 생성
	//2) mycal클래스의 메서드들을 모듈(부품)화 할 예정
	//3) 공통 인터페이스 도입
	//4) di(의존성 객체 주입)
	
	//더하기 빼기 곱하기 나누기 메서드
		//add, sub, mul, div
		//접근 제어자 public
		//데이터 반환 없이 void 이용
		//print문으로 출력할 것
		//매개변수 int num1, int num2 이용해 작성
		
//		public void add(int num1, int num2, Ical ical) {
//			//Ical ical => Ical 이라는 타입으로 구현된 어떤 객체든 이자리에 들어올 수 있다.
//			//
//			//Caladd caladd = new Caladd();
//			//인터페이스는 객체화 할 수 없지만 데이터 타입은 사용할 수 있다.
//			//인터페이스 자체가 데이터 타입을 상속하므로 데이터 타입을 사용할 수 있다.
//			//Ical ical = new Caladd();
//			int result = ical.doOper(num1, num2);
////			int result = num1 + num2;
//			System.out.println("더하기 :" +result);
//		}
//		public void sub(int num1, int num2, Ical ical) {
//			//Calsub calsub = new Calsub();
//			//Ical ical = new Calsub();
//			int result = ical.doOper(num1, num2);
////			int result = num1 - num2;
//			System.out.println("빼기 :" +result);
//		}
//		public void mul(int num1, int num2, Ical ical) {
//			//Calmul calmul = new Calmul();
//			//Ical ical = new Calmul();
//			int result = ical.doOper(num1, num2);
////			int result = num1 * num2;
//			System.out.println("곱하기 :" +result);
//		}
//		public void div(int num1, int num2, Ical ical) {
//			//Caldiv caldiv = new Caldiv();
//			//Ical ical = new Caldiv();
//			int result = ical.doOper(num1, num2);
////			int result = (num2 != 0)? num1 / num2 : 0;
//			System.out.println("나누기 :" +result);
//		}
	
}
