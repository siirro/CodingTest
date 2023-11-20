import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int c = 0;

        while (N > 0) {
            //5의 배수로 끝나면 count와 5로 나뉜값 더해 출력
            if (N%5 == 0) {
                c = c + N/5;
                System.out.println(c);
                return;
            }

            if (N<3) {
                System.out.println(-1);
                return;
            }
            N = N - 3;
            c++;
        }

        System.out.println(c);

    }
}