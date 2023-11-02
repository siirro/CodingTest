package programmers.lv0;

import java.util.Scanner;

public class day1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer = "";
        for(char aa : a.toCharArray()) {
            if(Character.isLowerCase(aa)) {
                aa = Character.toUpperCase(aa);
            } else {
                aa = Character.toLowerCase(aa);
            }
            answer = answer + aa;
        }
        
        System.out.println(answer);
    }
}
