import java.util.*;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> ar = new ArrayList<>();
        int cut = 0;

            for(int i=0; i<intStrs.length;i++) {
                if(s+l<=intStrs[i].length()&&intStrs[i].length()<=120)
                cut = Integer.parseInt(intStrs[i].substring(s, s+l));
                if(cut>k) {
                    ar.add(cut);
                }
            }
        
            
            
            
        return ar;
    }
}