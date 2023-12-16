import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        // 0~9의 개수를 판단할 배열 생성
        int[] regits = new int[10];
        
        // 넘버스에 있는 숫자를 regits 인덱스에 들어가게해서 1씩 올려줌
        for(int i=0; i<numbers.length; i++) {
            regits[numbers[i]] += 1;
        }

        for(int i=0; i<regits.length; i++) {
            if(regits[i]==0) {
                answer += i;
            }
        }
        
        return answer;
    }
}