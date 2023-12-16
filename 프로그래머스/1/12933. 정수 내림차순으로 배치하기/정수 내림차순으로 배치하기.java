import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // 정수 n을 쪼개서 char 배열에 넣음
        String number = String.valueOf(n);
        char[] charArr = new char[number.length()];
        charArr = number.toCharArray();
        
        // 내림차순 컴페레이터를 사용하기 위해 char배열 래퍼클래스배열로 만들어줌
        Character[] CharArr = new Character[charArr.length];
        for(int i=0; i<charArr.length; i++) {
            CharArr[i] = charArr[i];
        }
        
        // 배열 속 숫자를 내림차순
        Arrays.sort(CharArr, Collections.reverseOrder());
        
        // 다시 배열속 숫자들을 하나의 문자열로 합치기
        StringBuilder sb = new StringBuilder();
        for(char c : CharArr) {
            sb.append(c);
        }
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}