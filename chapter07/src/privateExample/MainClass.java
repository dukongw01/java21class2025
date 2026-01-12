package privateExample;

public class MainClass {

	public static void main(String[] args) {
		privateEx01 nn = new privateEx01();
//		nn.getNum(); // get은 무조건 출력만
		nn.setNum(20); //set은 값을 입력할 수 있다.
		System.out.println("값 :"+nn.getNum());
		System.out.println();

	}

}
