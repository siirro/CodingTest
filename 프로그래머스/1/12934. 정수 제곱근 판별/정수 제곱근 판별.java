class Solution {
    public long solution(long n) {
        long answer = 0;
        
        //n의 제곱근 찾기
        long sqrtN = (long)Math.sqrt(n);
        
        if(n == sqrtN*sqrtN) {
            answer = (sqrtN+1)*(sqrtN+1);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}