import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>(); 
        
        // 조건에 맞는 수만 새로운 배열에 담음
        for(int num:arr) {
            if(num%divisor==0) {
                list.add(num);
            }
        }
        
        // 조건에 맞는 요소가 없다면 배열에 -1 담음
        if(list.size()==0) {
            list.add(-1);
        }
        
        Collections.sort(list);
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        
        return answer;
    }
}