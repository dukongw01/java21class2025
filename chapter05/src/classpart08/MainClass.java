package classpart08;

public class MainClass {

	public static void main(String[] args) {
		
		Class08 c08 = new Class08();

//		System.out.println(c08.add);
		System.out.print("더하기 :");
		System.out.println(c08.add(10, 8));
		
		System.out.print("빼기 :");
		System.out.println(c08.minus(10, 8));
		
		System.out.print("곱하기 :");
		System.out.println(c08.mulitply(10, 8));
		
		System.out.print("나누기 :");
		System.out.println(c08.divid(10, 8));
		
	}

}
