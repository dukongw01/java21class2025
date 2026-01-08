package classpart06;
import java.util.*;

public class MainClass {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//객체화
		ClassEx06 e06 = new ClassEx06();
		boolean run = true;
		e06.name="Mega Bank";
		
		while(run) {
			System.out.println("-----");
			System.out.println("계좌\t비밀번호\t계좌잔액");
			System.out.println("-----");
			for(int i=0; i<e06.count.length; i++) {
				System.out.println(e06.arAcc[i]+"\t"+e06.arPw[i]+"\t"+e06.arMoney[i]);
			}
			System.out.println("-----");
			System.out.println("\n["+e06.name+"]");
			//상태 함수를 호출
			e06.printStatus();
			System.out.println("[1]회원가입");
			System.out.println("[2]로그인");
			System.out.println("[3]로그아웃");
			System.out.println("[4]입금");
			System.out.println("[5]이체");
			System.out.println("[6]잔액조회");
			System.out.println("[0]종료");
			System.out.println("선택 :");
			int sel = scan.nextInt();
			if(sel==1) {
				System.out.print("계좌 : ");
				String acc = scan.next();
				System.out.print("비번 : ");
				String pw = scan.next();
				System.out.print("금액 : ");
				int money = scan.nextInt();
				//회원가입 함수 호출함
				System.out.println(e06.join(acc,pw,money) ? "가입성공":"중복계좌");
				
			}else if(sel==2) {
				System.out.print("계좌 : ");
				String acc = scan.next();
				System.out.print("비번 : ");
				String pw = scan.next();
				//로그인 함수
				System.out.println(e06.login(acc, pw)? "로그인 성공":"로그인 실패");
			}else if(sel==3) {
				//로그아웃 함수 호출
				e06.logout();
				System.out.println("로그아웃");
			}else if(sel==4) {
				//입금하는 함수
				//isLogin 메서드가 true를 반환하면 현재 로그인 상태임
				if(e06.isLogin()) continue;
				System.out.println("입금액 : ");
				int money = scan.nextInt();
				e06.deposit(money);
			}else if(sel==5) {
				//이체 함수 호출
				//로그인 된 상태에서만 이체 가능
				if(e06.isLogin()) continue;
				System.out.println("상대 계좌 : ");
				String acc = scan.next();
				System.out.println("금액 : ");
				int money = scan.nextInt();
				System.out.println(e06.transfer(acc, money)?"이체할래?":"로그인 해");
			}else if(sel==6) {
				//잔액 조회 함수
				//로그인 상태에서만 잔액조회가능
				if(e06.isLogin()) continue;
				System.out.println("잔액 : "+e06.getBalance());
			}else {
				run = false;
			}
		}
	}
}
