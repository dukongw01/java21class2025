package example;

public class ArrEx06_1 {

	public static void main(String[] args) {
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		int max = 0;
		int in = 0;
		System.out.println("1등");
		
		for(int i=0; i<hakbuns.length; i++) {
			if(max<scores[i]) {
				max=hakbuns[in];
			}
		}
		System.out.println(hakbuns+"의 성적"+scores[max]);
		
	}

}
