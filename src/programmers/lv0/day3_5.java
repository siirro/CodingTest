package programmers.lv0;

public class day3_5 {

	public static void main(String[] args, int a, int b) {
		
        int answer = 0;
        String aa = Integer.toString(a);
        String bb = Integer.toString(b);
            
        if(Integer.parseInt(aa+bb) >= 2*a*b) {
            answer = Integer.parseInt(aa+bb);
        } else {
            answer = 2*a*b;
        }


	}

}
