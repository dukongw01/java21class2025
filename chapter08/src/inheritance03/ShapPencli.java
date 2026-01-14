package inheritance03;

public class ShapPencli {
	
	protected int residual ; //잔여량
	String name = "shappencil"; //펜이름
	protected int thickness = 1; //굵기

	//디폴트
	public ShapPencli() {};
	public ShapPencli(int residual, int thickness) {
		this.residual = residual;
		this.thickness = thickness;
	};
	
	//매개
	public int getResidual() {
		return residual;
	}
	
	public void setResidual(int residual) {
		this.residual = residual;
	}
	
	public int getThickness() {
		return thickness;
	}
	
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
	
	public void printp() {
		 residual = 10;
		 thickness = 1;
		 name = "shappencil";
		System.out.println(name +"=" + "잔여량:" + residual + " 굵기:" + thickness);
	}
	
}
