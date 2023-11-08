import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        
        while(i<arr.length) {
            if(stk.size()==0) {
                stk.add(arr[i]);
                i += 1;
            } else if(stk.size()>0&&stk.get(stk.size()-1)<arr[i]) {
                stk.add(arr[i]);
                i += 1;
            } else if(stk.size()>0&&stk.get(stk.size()-1)>=arr[i]) {
                stk.remove(stk.size()-1);
            } else {
                
            }
        }
        return stk;
    }
}