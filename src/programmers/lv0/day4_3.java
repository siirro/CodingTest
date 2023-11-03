package programmers.lv0;

public class day4_3 {

	public static void main(String[] args, int n) {
		int answer = 0;

        if(n%2==1) {
            for(int i=0;i<=n;i++) {
                if(i%2==1) {
                    answer += i;
                }else {}
            }
        } else {
            for(int i=0;i<=n;i++) {
                if(i%2==0) {
                    answer += i*i;
                }else {}
            }
        }


	}

}
