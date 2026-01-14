package inheritance03;

public class BollPen extends ShapPencli{
	
	String Color;
	//생성자
	
	public BollPen() {};
	public BollPen(String Color, int residual, int thickness) {
		this.Color=Color;
		super.residual=residual;
		super.setThickness(thickness);
	};
	
	@Override
	public void printp() {
		 residual = 25;
		 thickness = 2;
		 name = "BollPen";
		 Color = "black";
		System.out.println(name +"=" + "잔여량:" + residual + " 굵기:" + thickness + " 색상:" + Color);
	}

}
