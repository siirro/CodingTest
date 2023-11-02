package bronze5;

import java.util.Scanner;

public class b2420 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Long N = sc.nextLong();
		Long M = sc.nextLong();
		
		sc.close();
		
		Long num = N-M;
		
		System.out.println(Math.abs(num));
				
	}

}
