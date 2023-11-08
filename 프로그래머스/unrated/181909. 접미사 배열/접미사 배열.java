import java.util.*;

class Solution {
    public List<String> solution(String my_string) {
        List<String> ar = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            ar.add(my_string.substring(i));
        }    
        
        Collections.sort(ar);
        return ar;
    }
}