package polymorphism;

public class Tiger extends Animal{
	@Override //오버라이드 = 가상 메서드 / 오버라이딩되면 가상 메서드에 저장됨
	//오버라이딩 = 재정의
	public void move() {
		System.out.println("호랑이 사족보행");
	}
}
