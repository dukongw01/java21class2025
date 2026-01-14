package inheritance04;

public class VIPCustomer extends Customer {
	
	//멤버 변수
	protected int agentID; //상담번호
	double salePoint; //할인율
	
	//생성자
	public VIPCustomer() {};
	public VIPCustomer(int customerID, String customerName, String customerGread) {
		super(customerID,customerName);
		customerGread = "VIP";
		bonusRatio = 0.05;
		this.agentID = agentID;
		this.salePoint = 0.1;
	};
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price*this.bonusPoint);
		return price - (int)(price*salePoint);
	}
	
	@Override
	//출력 메서드
	public String ShowCustomerInfo() {
		return super.ShowCustomerInfo()+"\n, 담당 상담은: "+agentID+"번 입니다.";
		}
	
	
}
