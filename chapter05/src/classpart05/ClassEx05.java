package classpart05;
import java.util.*;

public class ClassEx05 {
	
	int[] answer = {1,3,4,2,5}; //모범답안
	int[] hgd = new int[5];
	int score = 0;
	
	//디폴트 생성자
	public ClassEx05() {};
	
	public void makeRandom() {
		Random ran= new Random();
		for(int i=0; i<hgd.length; i++) {
			hgd[i] = ran.nextInt(5) + 1;
		}
	}
	
	//모범 답안, 랜덤한 내 답안, 정오표, 점수 출력 함수
	public void printResult() {
		System.out.println("정답 :");
		//확장 for문이라 한다.
		//확장 for문 사용법
		//for(자료형 변수 : 배열){실행문}
		//확장 for의 장점 1. index를 사용 않음
		// 2. 코드가 짧음
		// 3. 요소를 하나씩 처리함
		//int[] answer = {123425}
		//answer 배열에서 값을 하나 꺼내서 n에 담고 출력. 배열이 끝날때까지 계속 순회
		//단, index를 가져올 수 없기 때문에 배열방의 값을 비교할 때는 사용 불가
		for(int n : answer)
			System.out.print(n+" ");
		System.out.println("\n응답 :");
		for(int n:hgd)
			System.out.print(n+" ");
		System.out.println("\n정오표 :");
		for(int i=0; i<answer.length; i++) {
			if(answer[i] == hgd[i]) {
				System.out.print("O");
				score += 20;
			}else {
				System.out.print("X");
			}
		}
		System.out.println("\n성적 :"+score);
	}
	
}
