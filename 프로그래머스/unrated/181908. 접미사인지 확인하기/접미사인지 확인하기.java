import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        List<String> ar = new ArrayList<>();
        int flag = 0;
        
        for(int i=0; i<my_string.length(); i++) {
            ar.add(my_string.substring(i));
        }
        
        if(ar.contains(is_suffix)) {
            flag = 1;
        }
        
        return flag;
    }
}