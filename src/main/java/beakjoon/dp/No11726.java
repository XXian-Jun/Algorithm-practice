package main.java.beakjoon.dp;
import java.util.Scanner;

/** 백준 문제 11726번 2×n 타일링
 * https://www.acmicpc.net/problem/11726
 * 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
 * 입력 : 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 * 출력 : 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 */

public class No11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //testcase
        //두개의 배열을 받아야함 0, 과  1 더한

        int []dp = new int[1001];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<1001; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }

        System.out.println(dp[t]);











    }
}

