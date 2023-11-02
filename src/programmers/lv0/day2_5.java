package programmers.lv0;

import java.util.Scanner;

class day2_5 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        // String go = my_string.substring(s, s+overwrite_string.length());
        // answer = my_string.replace(go, overwrite_string);

        String string = "abcde";

        StringBuffer sb = new StringBuffer(my_string);
        answer = sb.replace(s, s+overwrite_string.length(), overwrite_string).toString();

        return answer;
    }

    public static void main(String[] args) {
    	day2_5 so = new day2_5();
        Scanner sc = new Scanner(System.in);
        String ms = sc.next();
        String os = sc.next();
        int s = sc.nextInt();

        if(ms.length()-os.length()>=s && ms.length()>=os.length()) {
            System.out.println(so.solution(ms, os, s));
        }

    }
}