package example;

import java.util.*;

public class ArrEx06 {

	public static void main(String[] args) {
//		<문제06>  학생성적관리 프로그램: 1등학생
//		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
//		int[] scores = { 87, 11, 45, 98, 23};
//		문제) 1등 학생의 학번과 성적 출력
//		정답) 1004번(98점)
		
//		//Scanner scan = new Scanner(System.in);
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		
		System.out.println("1등");
		//int hak = scan.nextInt(); //1001, 1002
		int win = 0; //max값을 비교
		int index = 0;
		for(int i=0; i<hakbuns.length; i++) {
			if(win<scores[i]) {
				win = scores[i]; //score가 win보다 크면 값을 넘긴다
				index = i;
			}
		}
		
			System.out.println("학번:"+hakbuns[index]+"  점수:"+scores[index]);
		
		
		

	}

}
