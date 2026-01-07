package methodClass;

public class returnClass {
	
	//method 작성 연습
	//void로 메소드 작성시 값을 반환 할 수 없다.
	public void Returnint() {
		int k = 10;
	}
	
	//데이터 타입으로 메서드 작성시 반드시 값을 반환해야 한다.
	public String ReturnString() {
		return "자바";
	}
	
	public static void main(String[] args) {
		//객체화
		returnClass rt = new returnClass();
		rt.Returnint(); //값을 반환하지 않았기 때문에 출력 못함
		String res = rt.ReturnString(); //Return으로 반환한 "자바"를 저장
		System.out.println(res);
	}
	
}
