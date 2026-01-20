package scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("등급 높은 고객 우선");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 능력 우수 상담원에게 우선");
		
	}

	@Override
	public void getLunch() {
		// TODO Auto-generated method stub
		
	}
	
}
