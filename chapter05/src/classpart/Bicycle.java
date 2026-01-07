package classpart;

public class Bicycle {
	
	//멤버 변수
	String color;
	int price;
	
	//기본 생성자
	public Bicycle() {
		System.out.println("Bicycle constructor -1");
	}
	
	//매개변수 존재 생성자
	public Bicycle(String c, int p) {		
		System.out.println("Bicycle constructor -2");
		color = c;
		price = p;
	}
	
	//기능 = 메서드 //출력 메서드 생성
	public void info() {
		System.out.println("--info--");
		System.out.println("color: "+color);
		System.out.println("price: "+price);
	}
	
	public static void main(String[] args) {
		Bicycle myb = new Bicycle();
		myb.info();
		Bicycle myb2 = new Bicycle("red",10000);
		myb2.info();
	}
	
	
}
