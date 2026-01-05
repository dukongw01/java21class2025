package multiexample;

import java.util.*;

public class String_example01 {

	public static void main(String[] args) {
		
		//string 객테 데이터 타입은 new로 생성하여 작성하는 경우
		//Heap메모리에 저장된다.
		//==(는는)연산자는 참조타입의 값이 아니라 주소(참조)를 비교한다.
		//equals()메서드는 값 또는 내용만 비교한다.
		
		String a = new String("hongpossible");
		String b = new String("hongpossible");
		
		//a와 b의 물리적 주소 = 참조 주소
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		if(a==b) {
			//804564176
			//1421795058
			//a와 b는 문자으 ㅣ데이터 값은 같아도 서로 다른 참조 주소이므로 같지 않다.
			System.out.println("a==b");
		}
		if(a.equals(b)) {
			System.out.println("a.equals(b)//true");
		}
		
		System.out.println("--------구분선"); // -----구분선
		
		//문자열 리터럴을 이용하여 작성
		//문자열 리터럴을 이용하여 작성하면 스트링 풀에 저장됨을 주의하자
		//같은 문자열 리터럴이 이미 존재하면 새로 만들지 않고 기존 객테를 재사용
		//참조 주소가 같기 때문에 ==연산자를 이용해 비교해도 트루가 출력된다.
		String c = "hong";
		String d = "hong";
		
		//a와 b의 물리적 주소 = 참조 주소
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
		if(c==d) {
			//804564176
			//1421795058
			//a와 b는 문자으 ㅣ데이터 값은 같아도 서로 다른 참조 주소이므로 같지 않다.
			System.out.println("c==d");
		}
		if(c.equals(d)) {
			System.out.println("c.equals(d)//true");
		}
		
		
		System.out.println("--------구분선"); // -----구분선-----
		
		//Scanner의 next()동작 방식은 키보드 입력을 하면
		//String Pool을 사용하지 않고 새로운 String 객테를 Heap에 생성
		Scanner scan = new Scanner(System.in);
		//Scanner 입력 받은 숫자의 예외처리는 try ~ catch()를 이용한다.
		//키보드 또는 네트워크를 통해 가지고 오는 데이터의 오류는 컴퓨터가 알지 못한다.
		//그러니 try ~ catch()를 통해 오류 메세지를 전달한다. 이걸 예외처리라고 함.

		String name = "홍길동";
		String str = scan.next();
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(str));
		
		if(str.equals(name)) {
			System.out.println("equals() 일치");
		}if(name.equals(str)) {
			System.out.println("equals() 일치");
		}else {
			System.out.println("equals() 불일치");
		}
		
//				System.out.println("숫자 입력");
//		try {
//			int num = scan.nextInt();
//		}catch(Exception e) {
//			System.out.println("숫자를 입력하세요");
//		}
		
		
		
	}

}
