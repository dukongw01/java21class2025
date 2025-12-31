package example;

import java.util.Random;
import java.util.Scanner;

public class ifEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ra = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rNum = ra.nextInt(100)+150;
		System.out.println("문제="+rNum);
		
		//가운데 숫자를 추출하는 식
		//250 => (250%100)/10
		int answer = (rNum%100)/10; //가운데 수 추출
		System.out.println("가운데 숫자가 뭔가요?");
		int inputanswer = scan.nextInt();
		
		if(answer==inputanswer) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
	}

}
