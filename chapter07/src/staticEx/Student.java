package staticEx;

public class Student {
	
	//static은 데이터 메모리 영역에 존재하며 서로 다른 인스턴스에 같은 값을 공유한다.
	//static 데이터 타입 변수이름 => 클래스 변수
	//static은 정적이란 의미를 갖는다.
	static int serialNum=1000; //이 1000의 값은 변하지 않는다.(정적이다)
	
	int studentId;
	String studentName;
	
	//디폴트 생성자
	public Student() {
		serialNum++;
		studentId = serialNum;
	}
	
}
