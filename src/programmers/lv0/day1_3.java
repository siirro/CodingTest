package programmers.lv0;

import java.util.Scanner;

public class day1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        if(str.length()<1 || str.length()>10 || n < 1 || n > 5) {
            System.out.println("잘못된 입력입니다");
        }else {
            for(int i=0 ; i<n ; i++) {
                System.out.print(str);
            }
        }
            
    }
}
