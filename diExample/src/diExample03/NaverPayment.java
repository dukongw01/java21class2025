package diExample03;

public class NaverPayment implements PaySystem {

	@Override
	public String PayName(String payname) {
		return payname + "으로";
	}

}
