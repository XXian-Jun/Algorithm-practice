package main.java.beakjoon.dp;
import java.util.Scanner;

/** 백준 문제 1003번 ( 피보나치 )
 * https://www.acmicpc.net/problem/1003
 *
 * 입력 :
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거2나 같은 자연수 또는 0이다.
 *
 * 출력 :
 * 각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.
 */

public class No1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //testcase
        //두개의 배열을 받아야함 0, 과  1 더한

        int[][] dp = new int[41][2];

        //dp[n][0] = fibonacci(n) 호출 시 0이 몇 번 호출되는지
        //dp[n][1] = fibonacci(n) 호출 시 1이 몇 번 호출되는지

        //초기값세팅
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        //점화식 2부터 시작하는 이유는 -> 첫번째 두번째 자리가 이미 정해져있기 때문에
        for (int i = 2; i < 41; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(dp[n][0] + " " + dp[n][1]);
        }
    }
}

