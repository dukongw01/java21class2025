package formatExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class simpleEx {

	public static void main(String[] args) throws ParseException {
		//SimpleDateFormat 클래스는 날짜를 특정 형식의 문자열로 출력하거나
		//문자열로 변환할때 사용한다.
		//출력 : SimpleDateFormat.format();
		//변경 : SimpleDateFormat.parse();
		//SimpleDateFormat 클래스도 new 예약어로 객체 생성한다.
		//SimpleDatrFormat.format("yyyy-mm-dd") => 따옴표 안에 변경할 날짜 형식 입력
		
		Scanner scan = new Scanner(System.in);
		
		//현재 날짜/시간 객체
		Date now = new Date();
		//날짜 포맷
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년-MM월-dd일");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년-MM월-dd일(E)");
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH:mm:ss a");
		//Mon Jan 12 10:41:59 KST 2026
		System.out.println(now);
		System.out.println(sdf1.format(now));
		System.out.println(sdf2.format(now));
		System.out.println(sdf3.format(now));
		System.out.println(sdf4.format(now));
		System.out.println(sdf1.parse("2026-02-03"));

	}

}
