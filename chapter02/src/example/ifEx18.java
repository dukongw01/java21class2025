package example;

import java.util.Scanner;

public class ifEx18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("이동할 정거장 수를 입력: ");
        int station = scan.nextInt();
        int fee = 0;

        if(station > 0 && station <= 5) {
            fee = 500;
        } else if(station >= 6 && station <= 10) {
                fee = 600;
        } else {//11~이후, 2정거장씩 50원 추가
        	if(station % 2 ==1) {
        		fee = 600;
        		int feeadd = (station - 10)/2*50;
        		//홀수역일때 50원이 적게 계산 되므로 50원 더해주는 코드
        		fee = fee + feeadd + 50;
        	}else if(station % 2 ==0) { //짝수역일때
        		fee = 600;
        		int feeadd=(station-10)/2*50;
        		fee=fee+feeadd;
        	}
        }

        System.out.println("요금 = " + fee + "원");
        scan.close();
    }
}