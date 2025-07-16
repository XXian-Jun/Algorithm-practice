package main.java.beakjoon.dp;
import java.util.Scanner;

/** 백준 문제 2133 타일 채우기
 * https://www.acmicpc.net/problem/2133
 * 3×N 크기의 벽을 2×1, 1×2 크기의 타일로 채우는 경우의 수를 구해보자.
 * 첫째 줄에 N(1 ≤ N ≤ 30)이 주어진다
 */

public class No2133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[31];
        int sum = 0;

        dp[0] = 1;
        dp[2] = 3;
        sum = dp[0];

        for (int i = 4; i <= n; i += 2) {
            dp[i] = dp[i - 2] * 3 + 2 * sum;
            sum += dp[i - 2];
        }

        if (n % 2 == 1) {
            System.out.println(0);
        } else {
            System.out.println(dp[n]);
        }
    }
}

