package programmers.lv0;

public class day3_2 {
	
	public String solution(String[] arr) {
        String answer = "";
        
        for(String s : arr) {
            answer += s;
        }
        
        // 더 간단한 방법
        String.join("", arr);
        
        
        return answer;
    }
}
