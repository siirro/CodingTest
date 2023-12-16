class Solution {
    public String solution(String[] seoul) {
        // 어레이리스트 안쓰고 반복문으로 찾을게
        int index = 0;
        
        for(String example : seoul) {
            if("Kim".equals(example)) {
                break;
            }
            index++;
        }
        
        String answer = "김서방은 "+index+"에 있다";
        return answer;
    }
}