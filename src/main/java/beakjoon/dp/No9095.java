package main.java.beakjoon.dp;
import java.util.Scanner;

/** 백준 문제 9095번
 * 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 */

public class No9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스

        for(int i=0; i<t; i++){
            int nn = sc.nextInt();
            int []dp = new int[nn+1]; // 비교할 첫번째 점수

            dp[0] = 1; //초기 재귀를 만들어줘야함
            dp[1] = 1;

            // 1 = 1, 2 = 2, 3= 3
            if (nn >= 2) dp[2] = 2;

            for (int j = 3; j <= nn; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }

            System.out.println(dp[nn]);

        }
    }
}