package inheritance02;

public class TvClass {
	
	protected int size; //인치
	
	//디폴트 생성
	
	public TvClass() {};
	
	//매개변수
	public TvClass(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size>0) {
			this.size = size;			
		}
	}
	

}
