package example;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object는 객체 데이터 타입으로 Java 최상위 데이터 타입이다.
		Object obj = new Object();
		System.out.println("hello java world!!");
//		java 주석 단축키 : ctrl + /
		int i; //변수 지정
		i = 10; //초기값 지정
		int j = 20;
		System.out.println("i의 번지"+i+obj.hashCode());
		//한줄 복사 단축키 ctrl + alt + 방향키(↓)
		System.out.println("j의 번지"+j+obj.hashCode());
		
	}

}
