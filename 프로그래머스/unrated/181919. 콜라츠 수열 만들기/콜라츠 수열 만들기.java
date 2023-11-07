import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        boolean flag = true;
        answer.add(n);
        
        while(flag) {
            if(n%2==0) {
                n = n/2;
            } else {
                n = n*3+1;
            }
            answer.add(n);
            flag = n==1 ? false : true;
        }
        return answer;
    }
}