package example;

public class Arrtest02 {

	public static void main(String[] args) {

			int size = 0;
			double[] data = new double[5];
			data[0]=10.0;size++;
			data[1]=20.0;size++;
			data[2]=30.0;size++;
			
			int total = 1;
//			data.length가 5, 초기값 인덱스 0,1,2만 지정. 나머지는 0.0이므로 무조건 0출력
			for(int i=0; i<size; i++) {
				total *= data[i];
//				System.out.println(data[i]);
			}
			System.out.println(total);
			
			

	}

}
