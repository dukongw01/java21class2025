package example;

public class ArrEx06_1 {

	public static void main(String[] args) {
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		int max = 0; //최대값
		int in = 0; // 인덱스
		System.out.println("1등");
		
		for(int i=0; i<hakbuns.length; i++) {
			if(max<scores[i]) {
				max=scores[i]; //i가 0일때 값 => score[0]:87
				in = i;
				System.out.println(in);
			}
		}
		System.out.println(hakbuns[in]+"의 성적"+scores[in]);
		
	}

}
