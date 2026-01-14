package inheritance04;

public class Customer {
	
	// 멤버 변수
	protected int customerID; //고객 아이디
	protected String customerName; //고객 이름
	protected String customerGread; //고객 등급
	int bonusPoint; //고객 보너스 포인트
	double bonusRatio; //고객 포인트 적립비율
	
	//디폴트 생성
	public Customer() {
		customerGread = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGread = "SILVER";
		bonusRatio = 0.01;
	}
	//메소드
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price;
	}
	
	//출력 메서드
	public String ShowCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGread + " 이며 보너스 포인트는 " + bonusPoint+" 입니다.";
	}
	
}
