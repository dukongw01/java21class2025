package multiexample;
import java.util.*;

public class String_example05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		//객체 데이터 기본값은 null이다.
		
		String[][] items = new String[100][2];
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111", "2222", "3333"};
		String[] items02 = {"사과", "바나나", "딸기"};
		int maxSize = 100;
		int[][] jang = new int[maxSize][2];
		//null값을 초기화 하기 위해 공백으로 초기화
		for(int i=0; i<items.length; i++) {
			for(int j=0; j<items[i].length; j++) {
				items[i][j]="";
			}
		}
		//0번째 열은 카테고리, 1번째 열은 아이템
		boolean run = true;
		int itemcnt = 0;
		
		while(run) {
			System.out.println();
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아이템 관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[0]종료");
			
			int sel = scan.nextInt();
		
		
//		<문제>쇼핑몰 [관리자]
//				1. 카테고리와 아이템을 입력 받아 아래의 예시와 같이 저장한다.
//				2. 카테고리는 각 행의 첫번째 열에 저장한다.
//				3. 아이템은 각 행의 두번째 열에 저장한다.
//				단, 아이템은 여러개를 추가할 수 있도록 슬래시(/)를 구분자로 연결해준다.
			if(sel == 1) {
				System.out.println("추가할 카테고리 입력");
				String categoryName = scan.next();
				items[itemcnt][0]=categoryName;
				itemcnt++;
			}else if(sel == 2) {
				//과일류 출력 코드[0]
				for(int i=0; i<itemcnt; i++) {
					System.out.printf("[%d] %s%n", i,items[i][0]);
				}
					System.out.print("카테고리 선택");
					int choice = scan.nextInt(); //0,1,2,3...
					System.out.print("추가할 아이템 입력");
					String addItem = scan.next();
					items[choice][1]+= addItem;
					items[choice][1]+= "/";
				}else if(sel == 3){
					for(int i=0;i<itemcnt; i++) {
						System.out.printf("%s: %s%n",items[i][0],items[i][1]);
					}
				}else {
				run = false;
				System.out.println("프로그램 종료");
			}
		
		
	
		}

	}

}
