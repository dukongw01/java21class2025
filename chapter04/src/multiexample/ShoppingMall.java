package multiexample;
import java.util.*;

public class ShoppingMall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
//		<문제>쇼핑몰 [장바구니]
//		1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
//		1) 사과
//		2) 바나나
//		3) 딸기
//		2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
//		3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
//		4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111", "2222", "3333"};
		String[] items = {"사과", "바나나", "딸기"};
		
		int maxSize = 100;
		int[][] jang = new int[maxSize][2];
		//회원별, 상품별 개수 담는 변수 // 배열로 잡았기 때문에
		int[][] cartcnt = new int[ids.length][items.length];//null값을 초기화 하기 위해 공백으로 초기화 안해도 된다
		//로그인 체크키
		int log = -1;
		//아이템 사는 개수
		int cnt=0;
		
		//0번째 열은 카테고리, 1번째 열은 아이템
		boolean run = true;
		int itemcnt = 0;
		
		while(run) {
			//로그인 상태 관리 부분
			System.out.println("-------");
			System.out.println("상태: ");
			if(log == -1) {
				System.out.println("로그아웃");
			}else {
				System.out.println(ids[log]);
			}
			System.out.println("------");
			System.out.println("[Green Mart]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택: ");
			int sel = scan.nextInt();
			
			if(sel == 1) { //로그인
				System.out.print("ID입력");
				String myId = scan.next();
				System.out.print("PW입력");
				String myPw = scan.next();
				
				//로그인 성공 boolean
				boolean loginscs = false;
				for(int i=0; i<ids.length; i++) {
					if(ids[i].equals(myId) && pws[i].equals(myPw)) {
						log = i;
						loginscs = true;
						break;
					}
				}
				if(loginscs) {
					System.out.println(ids[log]+"님 환영합니다");
				}else {
					System.out.println("ID와 PW를 확인하세요.");
				}
			}else if(sel == 2) { //로그아웃
				log = -1;
				System.out.println("로그아웃 되었습니다.");
			}else if(sel == 3) { //쇼핑
				//쇼핑몰 출력을 하려면 조건은 반드시 로그인 후 장바구니 확인이 필요
				if(log == -1) {
					System.out.println("로그인 후 이용가능");
					continue;
				}
				// 쇼핑몰 반복 => [1]사과 [2]바나나 [3]딸기 => 출력
				//while문 사용
				while(run) {
					System.out.println("상품목록");
					for(int i=0; i<items.length; i++) {
						System.out.printf("[%d]%s%n",(i+1),items[i]);
					}
					System.out.println("[4]뒤로가기");
					System.out.print("상품번호 선택하세요");
					int itemNum = scan.nextInt();
					if(itemNum == 4) {
						//뒤로 가기
						break;
					}
					//maxSize 100넘어가면 예외처리
					if(cnt == maxSize) {
						System.out.println("장바구니 가득함");
						break;
					}
					//ids별 쇼핑한 items별 개수를 cartcnt에 담는다
					jang[cnt][0] = log; //장바구니 0번째열에 log한 index번호 담기
					jang[cnt][1] = itemNum -1; //장바구니 1열에 내가 산 item index 번호 담기
					cartcnt[log][itemNum-1]++; //id별 쇼핑한 item들의 개수를 item별로 cartcnt에 담기
					//log=0, 회원 qwer, itemNum-1 => 0, 사과
					//cartcnt[0][0] = cartcnt[0][0] +1
					cnt++;
				}
			}else if(sel == 4) { //장바구니
				//내 장바구니는 로그인 상태에서만 출력가능
				if(log == -1) {
					System.out.println("로그인 후 이용 가능");
				}else {
					System.out.println("--내 바구니 목록");
					for(int i=0; i<items.length; i++) {
						System.out.println(items[i]+": "+cartcnt[log][i]+"개");
					}
				}
			}else{
				run = false;
				System.out.println("프로그램 종료");
			}
			
		}
		
		scan.close();

	}

}
