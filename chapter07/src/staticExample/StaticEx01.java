package staticExample;

public class StaticEx01 {

	static int atm = 0;
	
	String name;
	
	public StaticEx01() {};
	//오버로딩이란 StaticEx01의 기본 생성자를 재정의하여 사용한다
	//반드시 재정의 된 매개변수가 존재하는 생성자의 매개변수를 입력해야한다
	public StaticEx01(String name) {
		this.name = name;
	}
	
	//입금 메서드
	public void sMoney(int money) {
		atm += money;
		System.out.println("atm :"+atm);
	}
	
	// 출금 메서드
	public void spendMoney(int money) {
		atm -= money;
		System.out.println("atm :"+atm);
	}
	//출력 메서드
	public void getBankInfo() {
		System.out.println("name :"+this.name);
		System.out.println("atm :"+atm);
	}
	
}
