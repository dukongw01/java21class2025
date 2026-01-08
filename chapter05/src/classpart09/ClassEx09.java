package classpart09;

import java.util.*;

public class ClassEx09 {
	
	public void test(int[] x) {
		Random ran = new Random();
		System.out.print("[");
		for(int i=0; i<x.length; i++) {
			x[i] = ran.nextInt(100)+1;
			System.out.print(x[i]+"");
		}System.out.print("]");
	}
	
	public int total (int[] x) {
		for(int i=0; i<x.length; i++) {
			
		}
	}
	
}
