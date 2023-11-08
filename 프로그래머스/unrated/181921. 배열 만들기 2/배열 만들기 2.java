import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int l, int r) {
        
        List<Integer> arr = new ArrayList<>();
        int count = 0;
        
        for (int i=l; i<=r; i++) {
            count = 0;
            
            for(int j=0; j<Integer.toString(i).length(); j++) {
                if(Integer.toString(i).charAt(j) == 48||Integer.toString(i).charAt(j) == 53) {
                    count ++;
                }
            }

            if(Integer.toString(i).length()==count) {
                arr.add(i);
            }
        }
        
        if(arr.size()==0) {
            arr.add(-1);
        }
    
        
        return arr;
    }
}