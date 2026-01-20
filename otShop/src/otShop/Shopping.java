package otShop;

import java.util.*;

public class Shopping extends UserMenu {
	//쇼핑 메뉴
	//인스턴스화
	ItemManager it = new ItemManager();
	Scanner scan = new Scanner(System.in);
	String menu = "[1]로그인\n [2]로그아웃\n [3]쇼핑\n [0]종료\n";
	String mageMenu = "[1]로그아웃\n [2]아이템관리\n [3]장바구니목록\n";
	String itemMenu = "[1]상품추가\n [2]상품삭제\n [3]상품수정\n [0]종료\n";
	
	//--메뉴--
	public void menu() {
		System.out.println();
		System.out.println(menu);
		System.out.println("메뉴선택 :");
		int select = scan.nextInt();
		
		if(select == 1) {
			//login 메서드 만들 예정
			if(log == 0) {
				//mageMenu(); 메서드 만들 예정
			}
		}else if(select == 2) {
			//logout 메서드 만들 예정
		}else if(select == 3) {
			//쇼핑은 반드시 로그인 상태여야 함
			if(log<0) {//log = -1 로그아웃
				System.out.println("로그인 후 이용 가능");
			}else {
				//로그인 상태 : log > 0
				//shop메뉴 만들예정
			} 
		}else {
			System.out.println("쇼핑몰 종료");
			break;
		}
	}
	// shopMenu ----
	public void shopMenu() {
		while(true) {
			System.out.println();
			System.out.println("[1]쇼핑목록\n[2]장바구니\n[0]뒤로가기\n");
			int select = scan.nextInt();
			
			if(select == 0) {
				break;
			}else if(select == 1) {
				it.printCategory();
				System.out.println("쇼핑목록 선택 [뒤로가기 -1]:");
				int caId = scan.nextInt();
				
				int n=0;
				for(int i=0; i<it.itemList.size(); i++) {
					//카테고리 인덱스에 해당 상품 존재 비교
					if(it.category.get(caId).equals(it.itemList.get(i).category)) {
						System.out.println("["+i+"]");
						it.itemList.get(i).printInfo();
					}
					System.out.println("항목 선택");
					int itemId = scan.nextInt();
					//항목추가 => 장바구니 카트에 내가 산 항목 추가
					it.addCart(super.id[log], caId, itemId);
				}
			}else if(select == 2) {
				System.out.println();
				for(int i=0; i<it.jangList.size(); i++) {
					//로그인 한 id가 장바구니 id하고 같은지 예외처리
					// 현재 고객 id별로 
					if(it.jangList.get(i).userId.equals(id[log])) {
						it.jangList.get(i).printCart();
					}
				}
				System.out.println("=======");
			}
		}
	}
	//------관리자 메서드
	public void mangerMenu() {
		while(true) {
			System.out.println();
			System.out.print("mageMenu");
			System.out.print("메뉴 선택");
			
			int select = scan.nextInt();
			
			if( select == 1) {
				logout();
				break;
			}else if(select ==2) {
				//아이템 관리 메서드 만들예정
			}else {
				System.out.println("==장바구니 리스트==");
				it.printJang();
				System.out.println("==============");
			}
		}
	}
	//아이템 관리 메뉴
	public void itemmage() {
		while(true) {
			System.out.println();
			System.out.printf(itemMenu);
			System.out.println("메뉴 선택 :");
			int select = scan.nextInt();
			
			if(select == 1) {
				System.out.println("추가할 아이템 이름");
				String addname = scan.next();
				System.out.println("추가할 금액");
				int addprice = scan.nextInt();
				System.out.println("추가할 아이템의 카테고리");
				int addcategory = scan.nextInt();
				//상품 추가
				it.addItem02(addname, addprice, addcategory);
				//상품 목록 출력
				it.printItemList();
			}else if(select ==2) {
				System.out.println("삭제할 item 번호 입력");
				int deleteindex = scan.nextInt();
				//삭제 메서드
				it.delItem(deleteindex);
				it.printItemList();
			}else if(select ==3) {
				System.out.println("수정할 아이템 번호 입력");
				int indexNum = scan.nextInt();
				System.out.println("수정할 아이템 이름 입력");
				String updatename = scan.next();
				System.out.println("수정할 아이템 금액 입력");
				int updateprice = scan.nextInt();
				//수정 메서드
				it.updateItem(indexNum, updatename, updateprice);
				it.printItemList();
			}else {
				System.out.println("아이템 관리 종료");
				//로그아웃
				break;
			}
		}
	}
	
	//로그인 메서드
	
	public void login() {
		if(log > -1) {
			System.out.println("이미 로그인 중");
		}else {
			log = super.userLog();
		}
	}

	
	//로그아웃 메서드
	public void logout() {
		if(log < 0) {
			System.out.println("이미 로그아웃");
		}else {
			log = -1;
			System.out.println("안녕히가세요.");
		}
	}
}
