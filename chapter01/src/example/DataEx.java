package example;

public class DataEx {
	public static void main(String[] args) {
		//char 데이터 타입 => 한 음절 표현, 반드시 'a' 작은따옴표 사용한다
		char ch= 'A'; //변수란 값 (value)을 대입하는 번지 주소를 이름으로 표현
		char ch2= 'a';
		System.out.println(ch);
		//(int)ch=>명시적 형 변환
		//char인 데이터 타입의 형을 명시해서 int로 변형하는 것
		System.out.println((int)ch);
		
		int ch3=67;
		System.out.println((char)ch3);
		
		//String=>객체 타입, 반드시 첫글자는 대문자
		//Integer => Integer 객체의 타입
		// 객체 타입으 ㅣ변수에 저장되는 값은 실제값이 존재하는 메모리의 번지 주소이다
		
		//현재 str 변수에 저장된 데이터는 "Abort"가 아니라
		//"Abort"가 존재하는 메모리 에드레스 주소인 2ff4acd0이다.
		String str="Abort";
		System.out.println(System.identityHashCode(str));
		int id = System .identityHashCode(str); //804564176
		System.out.println(Integer.toHexString(id)); //2ff4acd0
		
		String str2="홍길동";
		System.out.println(str);
		System.out.println(str2);
		
		// 이스케이프 형식을 이용해서 문자안의 각종 특정 문자를 포함 시킬 수 있다.
		// 이스케이프 형식 => \(역슬래시)" => \ 뒤의 문자가 출력된다.
		String str3 ="나는 \"자바\"를 좋아합니다.";
		System.out.println(str3);
		System.out.println("번호\t이름\t직업");
		System.out.print("행단위 출력");
		System.out.print("다음 줄 개행 \n");
		System.out.println("우리는\"개발자\"이다.");
		System.out.println("봄\\여름\\가을\\겨울");
		
		//byte 데이터 타입 => 1byte=8bit
		//byte 표현 범위 : -123 ~127
		//자바 기본으로 연산의 메모리 용량이 32bit이기 때문에
		//기본으로 정수는 int 데이터 타입을 사용한다.
		
		byte by1=127;
		//byte by2=128;
		//long 데이터 타입 => 정수(int) 타입의 허용 범위를 초과한 경우 반드시 L 또는 l접미사를 붙인다.
		//long lo1 = 1000000000000;
		long lo2 = 1000000000000L;
		long lo3 = 70;
		
		//실수형 자료 => Double(8byte), Float(4byte)
		//Float는 반드시 접미사 F 또는 f를 붙인다.
//		객체 타입이 아니니까 첫번째를 대문자로 쓰지 않는다.
		double dou = 3.14;
//		float flo = 3.14; //접미사 f가 없어서 오류 출력
		float flo = 3.14f;
		
		//논리 타입 boolean은 true(참)/ false(거짓) 두 가지
		boolean bool1 = true;
		boolean bool2 = false;
		
		//묵시적 형 변환 : 작은 공간의 메모리에서 큰 공간의 메모리로 이동
		byte by =10;
		int in = by;
		System.out.println("in="+in);
		//명시적 혈 변환 : 큰 공가느이 메모리에서 작은 공간의 메모리로 이동
		int ivar = 100;
		byte by2=(byte)ivar;
		System.out.println("by2="+by2);
	
		ivar = 123456;
		//int가 4byte 32bit이고, byte는 8bit이기 때문에
		//오버플로우가 되는 부분은 8bit만 남기고 모두 버림
		// 00000000 00000001 11100010 01000000
		// 00000000 00000001 11100010 => 싹다 버림
		// 0     1   0   0  0  0  0  0
		// 128  64  32  16  8  4  2  1
		by2=(byte)ivar;
		System.out.println("by2="+by2);
	}
}
