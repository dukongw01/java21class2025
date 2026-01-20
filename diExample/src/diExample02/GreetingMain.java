package diExample02;

public class GreetingMain {

	public static void main(String[] args) {
		GreetingService grs = new GreetingService();
		grs.greet("홍", new KrGreeting());
		grs.greet("길", new JpGreeting());
		grs.greet("동", new EngGreeting());
		
}
}