package scheduler;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) {
		//Scanner 입력 L, P, R
		Scanner scan = new Scanner(System.in);
		System.out.printf("정화상담배분방식선택 : R, L, P");
		//R또는 r, P또는 p, L또는 ㅣ 대소문 구분없이 눌러도 연결
		String ch = scan.next();
		Scheduler sch = null;
		
		if("R".equals(ch)||"r".equals(ch)) {
			//인스턴스 RoundRobin 한다.
			sch = new RoundRobin();
		}else if("P".equals(ch)||"p".equals(ch)){
			sch = new PriorityAllocation();
		}else if("L".equals(ch)||"l".equals(ch)){
			sch = new LeastJob();
		}else {
			System.out.println("지원하지 않는 기능");
			return;
		}
		//메서드 출력
		sch.getNextCall();
		sch.sendCallToAgent();
		sch.getLunch();
	}

}
