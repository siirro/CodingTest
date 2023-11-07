import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        List<Integer> ar = new ArrayList<>();
        
        for(int i=start_num; i<=end_num; i++) {
            ar.add(i);
        }
        
        answer = ar.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}