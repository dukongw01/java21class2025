package example;
import java.util.*;

public class ArrEx10 {
	public static void main(String[] args) {
		
//		Class 명 :ArrayEx10 로 작성 할 것
//		<문제10> 영화관 좌석예매[2]
//		1. 사용자로부터 좌석번호(index)를 입력 받아 예매하는 시스템이다.
//		2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
//		3. 이미 예매가 완료된 좌석은 재 구매할 수 없다.
//		4. 한 좌석당 예매 가격은 12000원이다.
//		5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
//		6. 예매 인원을 [1~7]명까지 입력 받는다.
//		7. 예매 인원이 1명일 경우 짝수 쪽 자리는 “예매 불가능“ 출력하고 [x]로 화면 출력한다.
//		8. 예매 인원이 2명 이상일 경우 제일 처음 선택하는 좌석 번호 옆자리가 자동으로 예매되도록 한다.

		Scanner scan = new Scanner(System.in);

		int[] sit = {11,22,33,44,55,66,77}; //좌석개수
		int[] tiket = {1,2,3,4,5,6,7}; //예매자
		
		System.out.println("선택 좌석:");
		int sitN = scan.nextInt(); //11,22,33,44
		int tk = 0; //예매 가능 여부 체크
		
		for(int i=0; i<10; i++) {
			if(sit[i]==0) {
				System.out.println("[ ]");
			}else if(sit[i]==2) {
				System.out.println("[X]");
			}else if(sit[i]==3) {
				System.out.println("[O]");
			}else(sit[i]==4) {
				System.out.println("[V]");
			}
		}
		
	}

}
