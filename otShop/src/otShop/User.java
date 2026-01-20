package otShop;

public class User {
	//데이터 (DTO) 클래스 : User, Item, Cart
	//기능 클래스 : UserMenu, ItemManager
	//실행흐름 제어 클래스 : ShopMain, Shopping
	String[] id= {"mmm", "kkk", "ccc", "ddd", "eee", "fff"};
	String[] pw= {"1234", "1111", "2222", "3333", "4444", "5555"};
	
	//현재 로그아웃 상태 : -1
	// 0 이상은 로그인한 유저의 index
	int log = -1;
	
}
