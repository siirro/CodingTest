class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] result = new int[absolutes.length];
        
        for(int i=0; i<absolutes.length; i++) {
            if(signs[i]) {
                result[i] = absolutes[i];
            } else {
                result[i] = -absolutes[i];
            }
            answer += result[i];
        }
        
        return answer;
    }
}