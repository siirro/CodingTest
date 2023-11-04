class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int i=0 ; i<code.length() ; i++) {
            if(code.charAt(i)=='1') {
                mode = mode == 0 ? 1 : 0;
                continue; //for 함수의 이번 인덱스 회차를 탈출함. 바로 다음 인덱스로 감
            }
            
            if(mode == 0) {
                ret = (i%2==0 ? ret+String.valueOf(code.charAt(i)) : ret);
            } else {
                ret = (i%2==1 ? ret+String.valueOf(code.charAt(i)) : ret);
            }
        }
        
        ret = ret=="" ? "EMPTY" : ret;
        
        return ret;
    }
}