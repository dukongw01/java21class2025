package inheritance;

public class Main {

	public static void main(String[] args) {
		// 부모와 자식 객체화
		ParentClass p = new ParentClass();
		ChildClass c = new ChildClass();
		//부모 클래스의 기본 생성자는 자식 클래스 보다 먼저 컴파일러가 불러온다
		//없으면 자동으로 생성해준다. 단, 부모의 디폴트 생성자가 존재 않는 경우 컴파일러는 자동생산 할 수 없다.
		
		c.childfun();
//		c.childfun(); 메서드 접근 가능한 이유는 childclass가 parentclass를 상속받았기 때문이다.
		c.parentfun();
		//main() 메소드에서 자식의 객체를 통해 변경된 a값을 출력할 수 있고
		//부모 객체를 새로 생성해서 그 변경된 값을 볼 수 없다.
		//부모 객테를 따로 생성하였기 때문에 a=10이 됨
		p.parentfun();
		System.out.println(c.a);
		System.out.println(c.b);

	}

}
