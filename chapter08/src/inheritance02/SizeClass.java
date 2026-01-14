package inheritance02;

//SizeClass(컬러티비) = 자식 클래스, Tv를 상속받음
public class SizeClass extends TvClass {
	//해상도 멤버변수 필요
	//size 멤버는 부모가 가지고 있음
	protected int res;
	
	public SizeClass() {};
	public SizeClass(int res, int size) {
		this.res = res;
//		super.size = size; //아래와 똑같음
		super.setSize(size);
	}
	public void printp() {
		//size는 부모 클래스인 TV에 멤버 변수로 상속받아 접근이 가능
		System.out.println(size+"인치"+res+"컬러");
	}
}
