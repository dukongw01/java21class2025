package example;

import java.util.*;

public class ArrEx03 {

	public static void main(String[] args) {
		// int[] arr = {87, 11, 45, 98, 23};
//		문제1) 인덱스를 입력받아 성적 출력
//		정답1) 인덱스 입력 : 1 
//		성적 : 11점
//		문제2) 성적을 입력받아 인덱스 출력
//		정답2) 성적 입력 : 11 
//		인덱스 : 1
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {87, 11, 45, 98, 23};
		System.out.println("인덱스를 입력:"); //스캔 받은 것은 앞에 프린트를 꼭 넣어주기
		
		int index = scan.nextInt();	
		System.out.println("성적:"+arr[index]);
		System.out.println("성적을 입력:");
		
		int score = scan.nextInt(); //87을 입력하면 위에서 찾아줌
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==score) {
				System.out.println("인덱스:"+i);
			}
		}
		

	}

}
