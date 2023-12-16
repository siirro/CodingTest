import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        // 어레이리스트가 훨씬편하다
        List<Integer> list = new ArrayList<>();
        for(int n:arr) {
            list.add(n);
        }
        
        int min = Collections.min(list);
        list.removeIf(num -> min==num);
        
        if(list.size()==0) {
            list.add(-1);
        }
        
        answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
        
        // 스트림 쓸거면 그냥 이렇게 하길..
//         int min = Arrays.stream(arr).min().orElse(-1);

//         int count = (int) Arrays.stream(arr).filter(num -> num != min).count();
//         if (count == 0) {
//             return new int[]{-1};
//         }

//         int[] answer = Arrays.stream(arr).filter(num -> num != min).toArray();
//         return answer;
    }
}