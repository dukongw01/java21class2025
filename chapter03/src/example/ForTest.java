package example;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ForTest {

	public static void main(String[] args) {
		// 반복문 for
		
		int i;
		for(i=0; i<=5; i++) {
			if(i==3) {
				break; // 조건을 만족하면 루프 탈출
//				continue; //조건에 만족하면 다시 for문으로 이동
			}
			System.out.println(i);
		}
//		System.out.println("루프 탈출:"+i);
		
		//다중 for문
		for(int j=1; j<=5; j++) {
			for(int k=1; k<=3; k++) {
				if(k==3) {
					break;
				}
//				System.out.printf("j=>%d, k=>%d%n", j, k);
			}
			System.out.println("밖의 루프"+j);
		}System.out.printf("루프 탈출");
		
		
		
		

	}

}
