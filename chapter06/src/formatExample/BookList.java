package formatExample;

import java.util.ArrayList;

public class BookList {

	//BookDTO를 ArrayList<>에 넣어야하는 이유
	// => int[] book = new int[100];
	// => BookDTO[] book = new BookDTO[100];
	
	//ArrayList<BookDTO> booklist = new ArrayList<>();
	//=> booklist[0] = {Booktitle:~,Author:~,publisher:~,Date:~,price:~}
	//=> booklist[1] = {Booktitle:~,Author:~,publisher:~,Date:~,price:~}
	//=> booklist[2] = {Booktitle:~,Author:~,publisher:~,Date:~,price:~}
	ArrayList<BookDTO> booklist;
	
	//생성자
	public BookList() {
		booklist = new ArrayList<BookDTO>();
	}
	
	//책 추가 메서드
	public void addBook(BookDTO bdto) {
		// bdto.Booktitle로 접근할 수 있는 상태가 됨
		booklist.add(bdto);
	}
	//총계 구하는 메소드
	public int getTotal() {
		int total = 0;
		for(BookDTO b:booklist) {
			total += b.price;
		}
		//데이터 타입이 void가 아니고 int이기 때문에 반드시 return받아야함
		return total;
	}
	
	//출력 메서드 => main()메소드에 작성해도 무방한 출력
	public void bookInfo() {
		System.out.println("============");
		System.out.println("도서명\t저자\t\t출판사\t\t출판일\t가격");
		System.out.println("============");
		for(BookDTO b: booklist) {
			b.showBook();
		}
		System.out.println("============");
	}

}
