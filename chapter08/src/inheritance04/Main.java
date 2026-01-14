package inheritance04;

public class Main {

	public static void main(String[] args) {
		
		//상속을 받은 하위 클래스는 상위 클래스를 데이터 타입으로 인스턴스화 할 수 있다.
		Customer cus02 = VIPCustomer(0200, "김길동", 1010);
		int money = cus02.clacd
		Customer cus = new Customer(0100, "이성계");
		int price = cus.clacPrice(10000);
		System.out.println("지불 금액은 "+price+" 이고,"cus.ShowCustomerInfo());

	}

}
