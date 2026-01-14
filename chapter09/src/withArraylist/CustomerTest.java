package withArraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		Customer customerLee = new Customer(10010,"이순신");
		Customer customerShin = new Customer(10011,"신사임당");
		GoldCustomer customerHong = new GoldCustomer(20010, "홍길동");
		GoldCustomer customerYul = new GoldCustomer(20011, "이율곡");
		VIPCustomer customerkim = new VIPCustomer(30010,"김유신",1234);
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerkim);
		System.out.println("======= 고객정보 출력 ========");
		for(int i=0;i<customerList.size();i++) {
		System.out.println(customerList.get(i).ShowCustomerInfo());
	}

}
