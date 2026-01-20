package abstractTest;

//추상 클래스를 extands로 상속받는다
public class Desktop extends Computer {

	@Override //부모 메서드를 상속받아 재정의 한다
	public void display() {
		System.out.println("Desktop display---");
		
	}

	@Override
	public void typing() {
		
		
	}

}
