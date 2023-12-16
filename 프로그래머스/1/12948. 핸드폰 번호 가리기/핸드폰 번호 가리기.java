class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        // 뒤 4자 제외한 길이만큼의 별 생성
        for(int i=0; i<phone_number.length()-4; i++) {
            answer += "*";
        }

        // star와 뒤 4자를 붙임
        answer += phone_number.substring(phone_number.length()-4, phone_number.length());
        return answer;
        
        // 정규표현식
        // answer = phone_number.replaceAll(".(?=.{4})", "*");
        
    }
}