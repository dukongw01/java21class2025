package scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화 순서대로");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담원 순서대로");
		
	}

	@Override
	public void getLunch() {
		// TODO Auto-generated method stub
		
	}
	
}
