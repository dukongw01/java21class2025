package diExample03;

public class PaymentProcessor {

	public void main(String Card, PaySystem payname) {
		String cn = payname.PayName(Card);
		System.out.println(cn);
	}

}
