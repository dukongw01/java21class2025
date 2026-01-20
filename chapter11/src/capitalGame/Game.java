package capitalGame;

import java.util.*;

public class Game {
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	//HashMap<>은 순서가 없다. 저장 순서도 없다.
	HashMap<String, String> hashCapital = new HashMap<>();
	
	//생성자
	//자바는 저장하고 컴파일하면 JVM이 제일 먼저 로드하는 것은 디폴트 생성자이다.
	public Game() {addNation();}
	
	//나라이름, 수도 저장 메서드
	public void addNation() {
		hashCapital.put("한국", "서울");
		hashCapital.put("미국", "워싱턴DC");
		hashCapital.put("중국", "베이징");
		hashCapital.put("프랑스", "파리");
		hashCapital.put("일본", "도쿄");
		hashCapital.put("스페인", "리스본");
	}
	
	//game menu 메서드 생성
	public void gamemenu() {
		boolean run = true;
		System.out.println("**수도 맞추기 게임 시작**");
		while(run) {
			System.out.println("입력: 1, 퀴즈: 2, 종료: 3>>");
			int select = scan.nextInt();
			
			switch (select) {
			case 1: {
				//게임 나라/수도 삽입 메서드
				break;
			}
			case 2: {
				//게임 start 메서드
				break;
			}
			case 3: {
				System.out.println("게임 종료함");
				run=false;
				break;
			}
		}
	}
}
	
	public void insertNation() {
		int cnt = hashCapital.size();
		//입력 문자 받아야함
		//scan.nextint()의 이슈 \n이 남는 상황을 제거
		scan.nextLine();
		System.out.println("현재"+cnt+"개 나라 수도가 입력됨");
		
		while(true) {//while은 true일때 무한 반복
			System.out.println("나라 수도 입력"+(cnt+1)+"");
			String nation = scan.nextLine();
			//그만이라 입력하면 삽입 종료
			if(nation.equals("그만")) break;
			//입력된 문자를 구분자 기준으로 잘라서 담아주는 클래스
			StringTokenizer st = new StringTokenizer(nation);
			//한국 서울 => 한국, 서울
			String na = st.nextToken().trim();//나라
			String ca = st.nextToken().trim();//수도
			if(hashCapital.containsKey(na)) {
				//같은 게 있으면 true 아니면 false;
				System.out.println("이미 존재");
				continue;
			}
			HashMap.put<na, ca>;
		}
	}
}
	
	}
