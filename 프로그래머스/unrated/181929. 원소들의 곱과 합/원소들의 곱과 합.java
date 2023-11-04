class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int p = 0;
        int m = 1;
        
        for(int i=0;i<num_list.length;i++) {
            p += num_list[i];
            m *= num_list[i];
        }
        
        if(m<Math.pow(p,2)) {
            answer = 1;
        }
        
        return answer;
    }
}
