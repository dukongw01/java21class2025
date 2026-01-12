package formatExample;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookDTO {

	String Booktitle;
	String Author;
	String Publeliser;
	Date Date;
	int price;
	
	//디폴트 생성자
	public BookDTO() {};
	
	//매개변수 생성자
	public BookDTO(String Booktitle, String Author, String Publeliser,Date Date, int price) {
		//this란 =>BookDTO 클래스를 의미
		this.Booktitle = Booktitle;
		this.Author = Author;
		this.Publeliser = Publeliser;
		this.Date = Date;
		this.price = price;
	}
	
	//출력하는 메서드 생성
	public void showBook() {
		//DecimalFormat을 사용해서 숫자의 형식을 변경하여 출력하면 문자가 됨을 주의하자
		DecimalFormat de = new DecimalFormat("#,##0원");
		//SimpleDateFormat을 이용하여 날짜의 형식을 변경하여 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
		System.out.printf("%s\t%s\t\t%s\t%s\t%s%n", Booktitle, Author,Publeliser,sdf.format(Date),de.format(price));
		
	}
	

}
