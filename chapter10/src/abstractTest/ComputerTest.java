package abstractTest;

public class ComputerTest {

	public static void main(String[] args) {
		//추상 클래스는 인스턴스화(객체화)할 수 없다
		
		Computer com1 = new Desktop();
		Computer com2  new Notebook();
		com1.display();
		com2.display(); 
		

	}

}
