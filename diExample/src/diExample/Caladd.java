package diExample;

public class Caladd implements Ical {
	//더하기 함수 모듈화(부품화)
	//부품화를 해야하는 이유 중 하나 : 자바는 느슨한 결합이 기본원칙
	// 느슨한 결합이어야 유지보수, 협업이 편해진다.
//	public int doOper(int num1, int num2) {
//		int result = num1 + num2;
//		return result;
//	}
	//단, 추상 메서드는 반드시 재정의(override)한다.
	@Override
	public int doOper(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
