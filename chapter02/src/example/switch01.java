package example;

public class switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade ='C';
		switch(grade) {
		case 'A':System.out.println("골드 혜택 받으실 수 있습니다.");
		case 'B':System.out.println("실버 혜택 받으실 수 있습니다.");
		case 'C':System.out.println("우수 혜택 받으실 수 있습니다.");
		case 'D':System.out.println("일반 혜택 받으실 수 있습니다.");
		default:System.out.println("혜택이 없습니다.");
		}
	}

}
