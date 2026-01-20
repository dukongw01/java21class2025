package queueInterface;

//shelf가 Queue를 implements
//bookshelf가 shelf를 extends받을 예정
//실무에서 많이 사용하는 방식이다.
public class Bookshelf extends Shelf implements Queue{

	@Override
	public void inQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		
		//꺼내기 => 삭제
		//ArrayList<>는 삭제되고나면 뒤 데이터 앞으로 이동
		return shelf.remove(0); //제일 첫번째 자료를 삭제
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
}
