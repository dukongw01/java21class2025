package example;

import java.util.*;

public class ArrEx04 {

	public static void main(String[] args) {
		
		// int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
//		int[] scores = { 87, 11, 45, 98, 23};
//		문제3) 학번을 입력 받아 성적 출력
//		정답3) 학번 입력 : 1003 성적 : 45점
		
		Scanner scan = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		
		System.out.println("학번:");
		int hak = scan.nextInt(); //1001 
		
		for(int i=0; i<hakbuns.length; i++) {
			if(hakbuns[i]==hak) {
				System.out.println("성적:"+scores[i]);
			}
		}
	}

}
