import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
//         //1. toCharArray를 쓰는 방법
//         // 1) 각 자리를 하나씩 떼어 배열로 만들기
//         // int n을 String으로 만들고, 만들어진 String을 각 하나하나 쪼개 배열로 만들어주는 toCharArray 메서드를 사용한다.
//         String nString = String.valueOf(n);
//         char[] charArr = nString.toCharArray();

//         // 2) 배열 속 값들을 하나씩 더해준다
//         for(char c : charArr) {
//             int num = Character.getNumericValue(c);
//             answer += num;
//         }
        
        //2. 수작업으로 배열 만들어 쓰는 방법 -> 큰 숫자에선 오버헤드 발생할 일 적어 더 효율적이다.
        // 1) 로그10을 이용해 숫자의 자리수를 계산하고, 자리수 만큼의 배열 생성
        int length = (int)(Math.log10(n) + 1);
        int[] arr = new int[length];
        
        // 2) 1의자리수부터 배열에 넣는방법! 
        // 숫자를 10으로 나눈 나머지값이 1의 자리수의 숫자이다. 그 값을 배열에 집어넣고, 수를 10으로 나눠 현재 일의자리수를 없애버리고 십의자리수가 일의자리수에 오게 만든다. 다시 10으로 나눈다! 끝까지 반복한다. 
        for(int i=0; i<length; i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        
        // 3) 만든 배열의 모든 값을 더해준다.
        for(int i : arr) {
            answer += i;
        }
        
        return answer;
    }
}
