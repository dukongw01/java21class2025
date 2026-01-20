package HashMap;

import java.util.*;

public class HashEx03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> pointM = new HashMap<String, Integer>();
        System.out.println("**포인트 관리 프로그램**");
        
        while(true) {
            System.out.print("이름과 포인트 입력>> ");
            String keyvalue = scan.nextLine();
            
            if(keyvalue.equals("그만")) break;
            
            StringTokenizer st = new StringTokenizer(keyvalue);
            String name = st.nextToken().trim();
            int pointNum = Integer.parseInt(st.nextToken());
            
            if(pointM.containsKey(name)) {
                pointNum += pointM.get(name);
            }
            
            pointM.put(name, pointNum);
            
            Set<String> keys = pointM.keySet();
            for(String key : keys) {
                int pointScore = pointM.get(key);
                System.out.print("(" + key + "," + pointScore + ") ");
            }
            System.out.println();
        }
        scan.close();
    }
}