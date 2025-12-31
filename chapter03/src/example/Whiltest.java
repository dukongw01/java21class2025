package example;

public class Whiltest {

	public static void main(String[] args) {
		// while(조건)문은 괄호안의 조건을 만족할때까지 loop(루프=반복)를 돌린다.
		// 조건이 false가 되면 loop를 빠져나간다.
		
		int num=1; //조건을 만족하기 위한 1씩 누적변수
		int sum=0; //총합계를 구하기 위한 변수
		
//		1~10까지의 값을 더한 값 출력 예정
//		while(num<=10) {
//			sum += num;
//			//num값을 누적시키지 않으면 무한루프발생
//			num++; //num = num + 1 => num=2;
//			System.out.printf("sum:%d, num:%d%n",sum,num);
//		}
		
//		while(true) {
//			sum += num;
//			num++;
//			break; //루프를 빠져나옴
//		}
//		System.out.println(sum);
//		System.out.println(num);
		
		//문제1) 10~1 까지 반복해서 6~3까지 거꾸로 출력
		//정답)6,5,4,3
		//while, if문 사용
		int num2 = 10;
		while(num2>=1) {
			if(num2<=6 && num2>=3) {
				System.out.println(num2+"");
		}
			num2--;
	}
		

	}

}
