package main.java.beakjoon.dp;
import java.util.Scanner;

/** 백준 문제 11727번
 * https://www.acmicpc.net/problem/11727
 */

public class No11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //testcase
        //두개의 배열을 받아야함 0, 과  1 더한

        //배열의 최대치가 1000
        int []dp = new int[1001];

        dp[0] = 1; //첫째칸이 기본값일수 있기에
        dp[1] = 1; //두째칸 *1

        for(int i=2; i<1001; i++){
            dp[i] = dp[i-1] + 2 * dp[i-2] % 10007;
        }

        System.out.println(dp[t]);



    }
}

