import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // 정수 n을 쪼개서 char 배열에 넣음
        String number = String.valueOf(n);
        char[] charArr = new char[number.length()];
        charArr = number.toCharArray();
        
        // 배열 속 숫자를 내림차순
        Arrays.sort(charArr);
        
        // 다시 배열속 숫자들을 하나의 문자열로 합치기
        StringBuilder sb = new StringBuilder(String.valueOf(charArr));
        sb.reverse();
        
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}