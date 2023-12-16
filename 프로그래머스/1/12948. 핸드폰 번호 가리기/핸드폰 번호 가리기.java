class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        // 뒤 4자리를 제외한 전화번호를 잘라서 sub에 저장
        String sub = phone_number.substring(0, phone_number.length()-4);
        
        // sub의 길이만큼의 별 생성
        String star = "";
        for(int i=0; i<sub.length(); i++) {
            star += "*";
        }
        
        // sub을 star로 치환
        answer = phone_number.replace(sub, star);
        return answer;
    }
}