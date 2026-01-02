package example;

import java.util.Arrays;

public class ArrEx01 {

	public static void main(String[] args) {
		// <문제01> 
//		<문제01> 
//		문제1) 10부터 50까지 arr배열에 저장 정답1) 10 20 30 40 50
//		문제2) 4의 배수만 출력 정답2) 20 40
//		문제3) 4의 배수의 합 출력 정답3) 60
//		문제4) 4의 배수의 개수 출력 정답4) 2
//		문제5) 짝수의 개수 출력
//		정답5)
		
		// index 는 0부터 시작
		int[] arr = {10, 20, 30, 40, 50};
		int cnt = 0;
		int sum = 0;
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]+" "+i);
			if(arr[i] % 4 == 0) {
				//해당 index 번호의 값이 4의 배수인지
				System.out.println("======");
				System.out.println(arr[i]+"4의 배수"+i);
				sum += arr[i];
				cnt ++;
			}
		}
		
		int cnt02 = 0;
		for(int i=0; i<arr.length; i++) {
			//해당하는 index 번호의 값이 짝수인지
			if(arr[i] % 2 == 0) {
				sum += arr[i];
				cnt02 ++;
			}
		}
		
		System.out.println(sum);
		System.out.println(cnt);
		System.out.println(cnt02);



	}

}
