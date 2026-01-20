package otShop;

import java.util.*;

public class ItemManager {
	Scanner scan = new Scanner(System.in);
	//카테고리는 string 자료형으로 ArrayList<>생성
	ArrayList<String> category = new ArrayList<>();
	
	//전체 아이템 리스트를 Item 자료형으로 ArrayList<> 생성
	ArrayList<Item> itemList = new ArrayList<>();
	//[0] => {name:~, price:~, category:~}
	
	//전체 장바구니 => Cart 클래스 자료형으로 ArrayList<> 생성 한다.
	ArrayList<Cart> jangList = new ArrayList<>();
	
	//객체화(인스턴스화)
	UserMenu user = new UserMenu();
	
	//디폴트 생성자
	public ItemManager() {};
	
	//itemList에 아이템을 추가하는 메서드 => ArrayList<>
	public void addItem(String name, int price, String category) {
		itemList.add(new Item(name,price,category));
	}
	//카테고리 추가 메서드
	public void info() {
		category.add("과자");//index가 0번째
		category.add("생선");//index가 1번째
		category.add("육류");//index가 2번째
		category.add("음료");//index가 3번째
		addItem("새우깡", 1000, category.get(0));
		addItem("고등어", 10000, category.get(1));
		addItem("칸쵸", 3500, category.get(0));
		addItem("소고기", 20000, category.get(2));
		addItem("돼지고기", 10000, category.get(2));
		addItem("콜라", 1500, category.get(3));
		addItem("사이다", 1500, category.get(3));
		addItem("새우", 18000, category.get(1));
	}
	//카테고리 출력 메서드
	public void printCategory() {
		for(int i=0; i<category.size(); i++) {
			System.out.println("[" + i + "]" + category.get(i));
		}
	}
	
	//item 목록 출력 메소드
	public void printItemList() {
		for(int i=0; i<itemList.size(); i++) {
			System.out.println("[" + i + "]");
			itemList.get(i);
		}
	}
	// ---장바구니 ---
	//userId, categort index 번호
	//uid = UserId / cid => category index 번호 / iid = > Item index 번호
	public void addCart(String uid, int cid, int iid) {
		//장바구니에 기존 아이템 유무 검사
		// 이미 존재하면 수량, 가격 누적
		//cart 인스턴스화
		int cnt = 0; //개수
		int jangcnt = 0; //장바구니 중복 데이터 유무 치트키
		int log = user.logindex; //userMenu 클래스의 로그인된 log값을 static으로 공유
		Cart temp = new Cart();
		temp.userId = uid;
		
		for(int i=0; i<itemList.size(); i++) {
			//비교해야 할 조건
			//(itemList.get(0).name) => 새우깡 듦
			//itemList.get(2).name => 칸쵸
			if(itemList.get(iid).name.equals(itemList.get(i).name)) {
				//조건이 true면 누적
				jangcnt = 0;
				for(int j=0; j<jangList.size(); j++) {
					//비교 => 현재 장바구니에 담긴 아이템 이름과 아이템리스트의 이름과 같은가?
					if(jangList.get(j).itemName.equals(itemList.get(i).name) && jangList.get(j).userId.equals(user.id[log])) {
						//가격, 수량 1씩 누적
						jangList.get(j).price += itemList.get(i).price;
						jangList.get(j).Quantity += 1;
						jangcnt += 1;
					}
				}
				//장바구니에 상품이 존재 않을때
				if(jangcnt == 0) {
					temp.itemName = itemList.get(i).name;
					temp.price = itemList.get(i).price;
					cnt += 1;
					temp.Quantity = cnt;
					//장바구니 추가
					jangList.add(temp);
				}
			}
		}
	}
	// ----- ----- -----
	
	//장바구니 출력 메서드
	public void printJang() {
		for(int i=0; i<jangList.size(); i++) {
			jangList.get(i).printCart();
		}
	}
	// 장바구니 출력 끝
	
	//전체 item 추가 메서드
	public void addItem02(String addname, int addprice, int addcategory) {
		//item클래스 추가 => add
		Item temp = new Item(addname, addprice, category.get(addcategory));
		itemList.add(temp);
	}
	//전체 아이템 삭제 메서드
	public void delItem(int delIndex) {
		itemList.remove(delIndex);
	}
	//전체 아이템 수정 메서드
	public void updateItem(int indexNum, String upName, int upPrice) {
		//for(int i=0; i<itemList.size(); i++) {
			itemList.get(indexNum).name = upName;
			itemList.get(indexNum).price = upPrice;
		//}
	}
}
