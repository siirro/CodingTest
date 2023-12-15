import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1. 각 자리를 하나씩 떼어 배열로 만들기
        // int n을 String으로 만들고, 만들어진 String을 각 하나하나 쪼개 배열로 만들어주는 toCharArray 메서드를 사용한다.
        String nString = String.valueOf(n);
        char[] charArr = nString.toCharArray();

        // 2. 배열 속 값들을 하나씩 더해준다
        for(char c : charArr) {
            int num = Character.getNumericValue(c);
            answer += num;
        }
        
        return answer;
    }
}