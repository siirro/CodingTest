class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        // 뒤 4자 제외한 길이만큼의 별 생성
        String star = "";
        for(int i=0; i<phone_number.length()-4; i++) {
            star += "*";
        }

        // star와 뒤 4자를 붙임
        star += phone_number.substring(phone_number.length()-4, phone_number.length());
        return star;
        
    }
}