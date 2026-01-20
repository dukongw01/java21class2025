package diExample02;

public class GreetingService {
	public void greet(String name, GreetingSystem grs) {
		String msg = grs.NameOper(name);
		System.out.println(msg);
	}
}
