package diExample02;

public class JpGreeting implements GreetingSystem{

	@Override
	public String NameOper(String name) {
		return "곤니" + name + "님";
	}

}
