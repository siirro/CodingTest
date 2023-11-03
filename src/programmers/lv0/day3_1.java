package programmers.lv0;

import java.util.Scanner;

public class day3_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		String answer = "";
        
        for(int i = 0 ; i<str1.length() ; i++) {
            answer += str1.substring(i, i+1);
            answer += str2.substring(i, i+1);
        }
        
        System.out.println(answer);
        
	}

}
