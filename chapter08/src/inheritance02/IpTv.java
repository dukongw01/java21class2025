package inheritance02;

//IPTV는 반드시 SizeClass(컬러티비) 를 상속받아야한다.
public class IpTv extends SizeClass {
	//멤버 변수 ip
	String ip;
	public IpTv() {};
	public IpTv(String ip, int res, int size) {
		this.ip = ip;
		//Color(size class) 부모의 멤버 res : 컬러
		super.res = res;
		//TV 부모의 멤버 size 크기
		super.size=size;
	};
	
	//@어노테이션, Override => 재정의하다 라는 뜻
	@Override
	public void printp() {
		//size는 부모 클래스인 TV에 멤버 변수로 상속받아 접근이 가능
		System.out.println(size+"인치"+res+"컬러");
	}
	
}
