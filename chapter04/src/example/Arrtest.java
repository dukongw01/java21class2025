package example;

import java.util.Arrays;

public class Arrtest {

	public static void main(String[] args) {
		// 배열 선언 방법
		//1. int[] arr = new int[3] (정석)
		//2. int arr[] = new int[3]
		
		//선택한 배열에 초기값 지정하는 방식
		// 1. int[] arr01 = new int[]{1,2,3};
		// 2. int[] arr01 = new int[3]{1,2,3}; => 오류 출력
		// 			이유 : 배열에 초기값 지정시 크기를 적지 말아야함
		// 3. int[] arr01={1,2,3};
		// 배열 선언 시 int[] arr = new int[] 오류, 반드시 크기 입력
		
		// 배열의 특징
		// 1. 배열은 고정길이다.
		// 2. 배열은 자동으로 길이를 늘리고 줄일 수 없다.
		// 3. 배열은 생성과 동싱 메모리를 한 번에 할당한다.
		// 4. 배열은 중간에 값을 비울 수 없다.
		// 5. 배열은 단순한 자료구조이므로 가변기능은 컬렉션이 담당한다.
		//		예) ArrayList, Linkedist, Vector, Stack...
		
		int[] arr = new int[3]; // arr = 배열, int [3] 방을 3개 만들었다.
		for(int i=0; i<arr.length; i++) {
			//정수형 배열의 초기값을 지정하지 않으면 0이 기본 값
			System.out.println(arr[i]);
		}
		
		double[] doub = new double[3];
		for(int j=0; j<doub.length; j++) {
			//실수형 배열의 초기값을 지정하지 않으면 0.0이 기본 값
			System.out.println(doub[j]);
		}
		
		String[] str = new String[3];
		String[] str02 = null;
		String[] str03 = null;
		
		//배열의 길이 = 3
		System.out.println(str.length);
		//배열의 요소값 = null, null, null
		System.out.println(Arrays.toString(str));
		//배열의 래퍼런스 = Ljava.lang.String;@2ff4acd0
		System.out.println(str);
		//객체 배열의 요소를 복사 : Arrays.copyOf(복사할 대상, 대상의 길이)
		str02 = Arrays.copyOf(str, str.length); //새로운 어드레스번지 주소 부여
		System.out.println(str02);
		str03 = str; //통으로 가져옴. 복사가 아님. 복사는 Arrays.copyOf() 뿐이다.
		System.out.println(str03);
		
		for(int k=0; k<str.length; k++) {
			//객체 배열의 초기값을 지정하지 않으면 null이 기본값
			System.out.println(str[k]);
			// 문제 : str이 null이면 '난 배열값'으로 출력하고 null이 아니면 본인 자기자신 값 출력
			//str[k]==null? "난 배열" :str[k];			
			//String 객체는 비교할 때 equals()사용해야 하지만 문제는 null이 객체가 아니므로 메소드 사용 못함
			// if(str[k].equals(null)) { <- 오류
//			if(str[k]==null) {
//				System.out.println("난 배열값");
//			}else {
//				System.out.println(str[k]);
//			}
//			System.out.println(str[k]);
//			또는
			String result = (str[k]==null?"난 배열 값":str[k]);
			System.out.println(result);
		}
 		

	}

}
