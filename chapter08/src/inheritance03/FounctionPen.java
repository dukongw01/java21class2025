package inheritance03;

public class FounctionPen extends BollPen{

	public FounctionPen() {};
	public FounctionPen(String Color, int residual, int thickness) {
		super.Color =Color;
		super.residual = residual;
		super.thickness = thickness;
	};
	
	@Override
	public void printp() {
		 residual = 15;
		 thickness = 2;
		 name = "FounctionPen";
		 Color = "blue";
		System.out.println(name +"=" + "잔여량:" + residual + " 굵기:" + thickness + " 색상:" + Color);
	}
}
