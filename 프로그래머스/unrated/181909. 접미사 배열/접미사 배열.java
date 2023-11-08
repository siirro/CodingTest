import java.util.*;

class Solution {
    public List<String> solution(String my_string) {
        List<String> ar = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            ar.add(my_string.substring(i));
        }    
        
        // 사전순 배열 1. collections.sort 사용
        // Collections.sort(ar);
        
        // 사전순 배열 2. list.sort 사용
        ar.sort(null);
        return ar;
    }
}
