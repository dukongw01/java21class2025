package multiexample;

import java.util.*;

public class MutiArrEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3]; //초기값 0
		int cnt =1; //누적
		int tot =0; //총계
		
		
		//2차원 배열 기본 문제[1단계]
		// 10 20 30
		// 30 50 60
		// 70 80 90
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = cnt * 10;
//				cnt ++;
//				System.out.println("누적 개수:"+cnt);
//				System.out.println(arr[i][j]+" ");
//				tot += arr[i][j];
//				System.out.println("총계:"+tot);
//			}
//			System.out.println();
//		}
		
		
		//문제2) 전체 합 출력 = 450
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				tot += arr[i][j] = cnt * 10;
//				cnt++;
//			}
//		}
//		System.out.println("총계:"+tot);
		
		
		
		//문제3) 4의 배수, 개수 출력 = 20 40 60 80
		
//		for(int i=1; i<arr.length; i++) {
//			for(int j=1; j<arr[i].length; j++) {
//				tot = arr[i][j] = cnt *20;
//				cnt++;
//				System.out.println(" "+tot);
//			}
//		}
		
		//문제4) 4의 배수 합 출력 = 200
//		for(int i=1; i<arr.length; i++) {
//			for(int j=1; j<arr[i].length; j++) {
//				tot += arr[i][j] = cnt *20;
//				cnt++;
//			}
//		}
//		System.out.println(" "+tot);
		
		//문제5) 인덱스 2개를 입력 받아 값 출력 = 인덱스 1 = 60
		// 인덱스 2
		// 10 20 30
		// 40 50 60
		// 70 80 90
		
			for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = cnt * 10;
				cnt ++;
				System.out.println("누적 개수:"+cnt);
				System.out.println(arr[i][j]+" ");
				tot += arr[i][j];
				System.out.println("총계:"+tot);
			}
			System.out.println();
		}
			System.out.println("--------------");
			System.out.println("값1: ");
			int num1 = scan.nextInt();
			System.out.println("값2: ");
			int num2 = scan.nextInt();
			//값의 인덱스 위치를 찾을 변수 4개 선언
			int n1Index01=0, n1Index02=0,n2Index01=0, n2Index02=0;
			//값을 교환하기 위해 임시기억 장소 temp
			int temp =0; //값을 교환할 때 빈 바구니 역할
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					if(num1 == arr[i][j]) {
						n1Index01=i;
						n1Index02=j;
					}if(num2 == arr[i][j]) {
						n2Index01=i;
						n2Index02=j;
					}
				}
				}
			//찾은 값들을 서로 교환하는 코드
			//temp =0 -> 60 => temp = 60;
			//arr[n1Index01][n1Index02] = arr[n2Index01][n2Index02]
			//arr[n2Index01][n2Index02] = 60
			arr[n1Index01][n1Index02] = arr[n2Index01][n2Index02];
			arr[n2Index01][n2Index02] = 60;
			
			// 값 출력
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++){
					System.out.println(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			

	}

}
