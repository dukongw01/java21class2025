package example;

import java.util.Random;
import java.util.Scanner;

public class ifEx17 {

	public static void main(String[] args) {
		
		//랜덤 숫자 1~50 중에 369에 해당값이 2개 이상
		// 2개 : 짝짝, 1개 : 짝 , 0 : 본인 수
		
		Random ra = new Random();
		Scanner scan = new Scanner(System.in);
		int rNum = ra.nextInt(50)+1;
		System.out.println("문제="+rNum);
		
		//10의 자리 =>/10
		int ten = rNum /10;
		//1의 자리 => % 10
		int one = rNum % 10;
		// 개수를 누적할 변수를 지정
		int cnt = 0;
		
		if (ten==3 || ten==6 || ten==9) {
			cnt++;
		}
		if(one==3 || one==6 || one==9) {
			cnt++;
		}
		
		if(cnt==2) {
			System.out.println("짝짝");
		}else if(cnt==1) {
			System.out.println("짝");
		}else {
			System.out.println(rNum);
		}
		
//		// 아래는 잘못된 방식이다. if의 답이 맞으면 빠져나와서 만나지 못한다.
//		else if(one==3||one==6||one==9) {
//			cnt++;
//		}
		
	}

}
