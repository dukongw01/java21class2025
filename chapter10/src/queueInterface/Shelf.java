package queueInterface;

import java.util.ArrayList;

public class Shelf {
	//멤버 변수
	protected ArrayList<String> shelf;
	//생성자
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	public ArrayList<String> getShelf() {
		return shelf;
	}
	public void setShelf(ArrayList<String> shelf) {
		this.shelf = shelf;
	}
	
}
