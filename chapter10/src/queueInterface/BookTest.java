package queueInterface;

public class BookTest {

	public static void main(String[] args) {
		//Queue 데이터 타입으로 업캐스팅
		Queue qsf = new Bookshelf();
		//문자 삽입
		//----------
		// <---- A | B | C | D <-----
		//----------
		qsf.inQueue("A");
		qsf.inQueue("B");
		qsf.inQueue("C");
		qsf.inQueue("D");
		System.out.println(qsf.deQueue());
		System.out.println(qsf.deQueue());
		System.out.println(qsf.deQueue());
		System.out.println(qsf.deQueue());
	}

}
